/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.ikarus;

import java.util.Vector;

/**
 *
 * @author Richard
 */
public class SCollection 
{

    public static Vector s_vector = new Vector();
    public static String headId;
    public static String collname;
    
    public SCollection(String head_id, String name) 
    {
        s_vector.add(0, head_id);
        headId = head_id;
        collname = name;
    }
    
    
    
}
