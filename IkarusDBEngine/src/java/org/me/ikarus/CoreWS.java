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
    public int STORE(@WebParam(name = "name") String name, @WebParam(name = "content") String content) {
        //TODO write your implementation code here:
        out.println(name + content);
        return 50;
    }

}
