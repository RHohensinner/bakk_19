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
import java.util.Map;

public class Main 
{
    private static int JsonIds = 0;
    private static Main instance = new Main();
    
    public static Map<Integer, String> json_map = new HashMap<Integer, String>();

    public static Main getInstance() {
        return instance;
    }
    
    private void Main() {
        assert(json_map == Collections.<Integer, String>emptyMap());
    }
    
    public void doSomething() {
    // do something useful
    }
    
    public int getNewJsonId()
    {
        return ++JsonIds;
    }
    
    public void addNewJson(int id, String content)
    {
        json_map.put(id, content);
    }
    
    public void printAllJson()
    {
        System.out.println("Mappings are: " + json_map);
    }
    
    public String findJson(Integer id)
    {
        String found_string = json_map.get(id);
        
        return found_string;
    }
    
    public void removeJson(Integer id)
    {
        json_map.remove(id);
    }
}