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

    public Vector s_vector = new Vector();
    public String headId;
    public String collname;
    public String scollId;
    
    public SCollection(String head_id, String name, String scoll_id) 
    {
        s_vector.add(0, head_id);
        headId = head_id;
        collname = name;
        scollId = scoll_id;
        System.out.println("SCollection constructor: " + head_id + " " + name);
    }
    
    
    
}
