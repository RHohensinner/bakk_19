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
    @WebMethod(operationName = "STORE")
    public String STORE(@WebParam(name = "content") String content) 
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
    @WebMethod(operationName = "GET")
    public String GET(@WebParam(name = "id") String id) 
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
    @WebMethod(operationName = "DELETE")
    public String DELETE(@WebParam(name = "id") String id) 
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
    @WebMethod(operationName = "MAKECOLL")
    public String MAKECOLL(@WebParam(name = "name") String name, @WebParam(name = "id") String id) 
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
    @WebMethod(operationName = "DELETECOLL")
    public String DELETECOLL(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name) 
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
    @WebMethod(operationName = "INSERTCOLL")
    public String INSERTCOLL(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name, @WebParam(name = "id") String id) 
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
    @WebMethod(operationName = "REMOVECOLL")
    public String REMOVECOLL(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name, @WebParam(name = "id") String id) 
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
    @WebMethod(operationName = "GETCOLL")
    public String GETCOLL(@WebParam(name = "sid") String sid, @WebParam(name = "name") String name) 
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
    @WebMethod(operationName = "RESET")
    public String RESET(@WebParam(name = "doom") String doom) 
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
