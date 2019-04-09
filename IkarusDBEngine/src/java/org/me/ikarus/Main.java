/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.ikarus;

/**
 *
 * @author Richard
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class Main 
{
    private static int JsonIds = 0;
    private static int ScollIds = 0;
    private static String JsonStringId;
    private static String ScollStringId;
    
    // id (e.g. "000001") - content (e.g. "{yljasldamy.xc}")
    public static Map<String, String> json_map = new HashMap<String, String>();
    // id (e.g. "S-000001") - name (e.g. "examplecollection")
    public static Map<String, String> coll_name_map = new HashMap<String, String>();
    // id (e.g. "S-000001") - s-coll-objects (e.g. "examplecollection")
    public static Map<String, SCollection> s_coll_map = new HashMap<String, SCollection>();
    //Vector scoll_vector = new Vector();
    
    private static Main instance = new Main();

    public static Main getInstance() {
        return instance;
    }
    
    private void Main() {
        assert(json_map == Collections.<String, String>emptyMap());
    }
    
    public String getStringId(Integer id) 
    {
        return String.format("%06d", id);
    }
    
    public String getNewJsonId()
    {
        ++JsonIds;
        JsonStringId = String.format("%06d", JsonIds);
        return JsonStringId;
    }
    
    public void addNewJson(String id, String content)
    {
        json_map.put(id, content);
    }
    
    public void printAllJson()
    {
        System.out.println("Mappings are: " + json_map);
    }
    
    public String findJson(String id)
    {
        String found_string = json_map.get(id);
        
        return found_string;
    }
    
    public void removeJson(String id)
    {
        json_map.remove(id);
    }
    
    //--------------------------------------------------------------------------
    
    public String makeNewScoll(String name, String id)
    {
        String sid = getNewScollId();

        if(coll_name_map.containsKey(sid))
        {
            return "ERR: S-COLL. ID ALREADY USED!";
        }
        else
        {
            coll_name_map.put(ScollStringId, name); 
        }
        
        
        if(json_map.containsKey(id))
        {
            SCollection new_coll = new SCollection(id, name);
            s_coll_map.put(sid, new_coll);
        }
        else
        {
            return "ERR: HEAD OBJ. DOESN'T EXIST!";
        }
         
        return ScollStringId + "(" + name + ")";
                 
    }
    
    public String getNewScollId()
    {
        ++ScollIds;
        ScollStringId = "s-" + String.format("%06d", ScollIds);
        return ScollStringId;
    }
    
    public String deleteScoll(String sid)
    {
        String name;
        
        if(!coll_name_map.containsKey(sid))
        {
            return "ERR: S-COLL. TO BE DELETED DOESN'T EXIST!";
        }
        else
        {
            name = coll_name_map.get(sid);
            s_coll_map.get(sid).s_vector.clear();
            s_coll_map.remove(sid);
            coll_name_map.remove(sid);
        }
        
        return sid + "(" + name + ")" + " deleted";
    }
    
    public String insertScoll(String sid, String id)
    {
        String name;
        
        if(!coll_name_map.containsKey(sid))
        {
            return "ERR: S-COLL. TO BE INSERTED INTO DOESN'T EXIST!";
        }
        else
        {
            if(!json_map.containsKey(id))
            {
               return "ERR: INVALID JSON ID!"; 
            }
            name = coll_name_map.get(sid);
            
            if(!s_coll_map.get(sid).s_vector.contains(id))
            {
                s_coll_map.get(sid).s_vector.add(s_coll_map.get(sid).s_vector.size(), id);
                return id + " successfully inserted into: " + sid + "(" + name + ")";   
            }
            else
            {
                return "ERR: JSON ID IS ALREADY A MEMBER OF S-COLL.!";   
            }
            
        }
    }
    
    public String removeScoll(String sid, String id)
    {
        String name;
        
        if(!coll_name_map.containsKey(sid))
        {
            return "ERR: S-COLL. TO BE REMOVED FROM DOESN'T EXIST!";
        }
        else
        {
            if(!json_map.containsKey(id))
            {
               return "ERR: INVALID JSON ID!"; 
            }
            
            name = coll_name_map.get(sid);
            if(s_coll_map.get(sid).headId.equals(id))
            {
                return "ERR: CANNOT REMOVE FROM S-COLL. BECAUSE OBJ. IS HEAD!(use deletecoll instead)!";
            }
            else
            {
                if(s_coll_map.get(sid).s_vector.contains(id))
                {
                    s_coll_map.get(sid).s_vector.remove(id);
                    return id + " successfully removed from: " + sid + "(" + name + ")";   
                }
                else
                {
                    return "ERR: JSON ID IS NOT A MEMBER OF S-COLL.!";
                }
                
            }
        }
    }
    
    public String getScoll(String sid)
    {   
        if(!coll_name_map.containsKey(sid))
        {
            return "ERR: S-COLL. TO BE SEARCHED DOESN'T EXIST!";
        }
        
        else
        {           
            String ret_string = "";
            int index;
            
            
            for(index = 0; index < s_coll_map.get(sid).s_vector.size(); index++) 
            {
                if(index == (s_coll_map.get(sid).s_vector.size() - 1))
                {
                    ret_string += s_coll_map.get(sid).s_vector.get(index).toString();
                    break;
                }
                
                else
                {
                    ret_string += s_coll_map.get(sid).s_vector.get(index).toString() + ",";
                }
            }
            
            return ret_string;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public void resetDB()
    {
        json_map.clear();
        coll_name_map.clear();
        s_coll_map.clear();
        JsonIds = 0;
        ScollIds = 0;
        JsonStringId = "";
        ScollStringId = "";
    }
    
    public String searchObj(String text)
    {
        String ret_string = "";
        int matches = 0;
        
        for (String key : json_map.keySet()) 
        {
            if(json_map.get(key).contains(text))
            {
                ret_string += key + ", ";
                matches++;
            }
        }
        
        if(matches == 0)
        {
            return null;
        }

        if(ret_string != null && ret_string.length() > 0) 
        {
            ret_string = ret_string.substring(0, ret_string.length() - 2);
        }
            
        return ret_string;
    }
    
    
}