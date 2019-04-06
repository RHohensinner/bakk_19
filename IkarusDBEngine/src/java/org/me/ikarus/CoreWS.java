/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.ikarus;

import static java.lang.System.out;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Richard
 */

@WebService(serviceName = "CoreWS")
public class CoreWS 
{

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "store")
    public String store(@WebParam(name = "content") String content) 
    {
        if(content == null)
        {
            return "content NULL";
        }
        
        String new_id = Main.getInstance().getNewJsonId();
        Main.getInstance().addNewJson(new_id, content);
        
        // server log:
        System.out.println("STORE: " + new_id + " " + content);
        
        return new_id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "get")
    public String get(@WebParam(name = "id") String id) 
    {   
        if(id == null)
        {
            return "id NULL";
        }
        
        String found_json = Main.getInstance().findJson(id);
        
        // server log:
        System.out.println("GET: " + id + " " + found_json);
        
        return found_json;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "delete")
    public String delete(@WebParam(name = "id") String id) 
    {
        if(id == null)
        {
            return "id NULL";
        }
        
        String found_json = Main.getInstance().findJson(id);
        
        // server log:
        System.out.println("DELETE: " + id + " " + found_json);
        
        if(found_json != null)
        {
            Main.getInstance().removeJson(id);
            return id + " deleted";
        }
        else
        {
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "makecoll")
    public String makecoll(@WebParam(name = "name") String name, @WebParam(name = "id") String id) 
    {
        if(id == null || name == null)
        {
            return "id or name NULL";
        }
        
        String ret_str = Main.getInstance().makeNewScoll(name, id);
        
        // server log:
        System.out.println("MAKECOLL: " + ret_str);
        
        return ret_str;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deletecoll")
    public String deletecoll(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name) 
    {
        if(sid == null || name == null)
        {
            return "sid or name NULL";
        }
        
        String ret_str = Main.getInstance().deleteScoll(sid, name);
        
        // server log:
        System.out.println("DELETECOLL: " + ret_str);
        
        return ret_str;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertcoll")
    public String insertcoll(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name, @WebParam(name = "id") String id) 
    {
        if(sid == null || name == null || id == null)
        {
            return "sid or name or id NULL";
        }
        
        String ret_str = Main.getInstance().insertScoll(sid, name, id);
        
        // server log:
        System.out.println("INSERTCOLL: " + ret_str);
        
        return ret_str;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "removecoll")
    public String remove(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name, @WebParam(name = "id") String id) 
    {
        if(sid == null || name == null || id == null)
        {
            return "sid or name or id NULL";
        }
        
        String ret_str = Main.getInstance().removeScoll(sid, name, id);
        
        // server log:
        System.out.println("REMOVECOLL: " + ret_str);
        
        return ret_str;
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "getcoll")
    public String getcoll(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name) 
    {
        if(sid == null || name == null)
        {
            return "sid or name or id NULL";
        }
        
        String ret_str = Main.getInstance().getScoll(sid, name);
        
        // server log:
        System.out.println("GETCOLL: " + ret_str);
        
        return ret_str;
    }
    
    /**
    * Web service operation
    */
    @WebMethod(operationName = "reset")
    public String reset(@WebParam(name = "doom") String doom) 
    {
        if(doom.equals("IKnowWhatIamDoing"))
        {
            Main.getInstance().resetDB();
            return "Database was successfully cleared!";
        }
        else
        {
            return null;
        }  
    }
}
