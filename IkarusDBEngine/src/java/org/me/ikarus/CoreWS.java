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
import org.json.simple.JSONObject;

/**
 *
 * @author Richard
 */

@WebService(serviceName = "CoreWS")
public class CoreWS {

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
    public int STORE(@WebParam(name = "content") String content) 
    {
        System.out.println("before insert:");
        Main.getInstance().printAllJson();
        
        int new_id = Main.getInstance().getNewJsonId();
        Main.getInstance().addNewJson(new_id, content);
        
        System.out.println("after insert:");
        
        return new_id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GET")
    public String GET(@WebParam(name = "id") int id) 
    {
        String found_json = Main.getInstance().findJson(id);
        
        return found_json;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DELETE")
    public Boolean DELETE(@WebParam(name = "id") int id) 
    {
        String found_json = Main.getInstance().findJson(id);
        
        Main.getInstance().printAllJson();
        
        if(found_json != null)
        {
            Main.getInstance().removeJson(id);
            return true;
        }
        else
        {
            return false;
        }
    }

}
