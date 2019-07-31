/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;
import java.util.*;
import java.io.*;
import org.apache.commons.collections.map.HashedMap;

/**
 *
 * @author GoD
 */
public class JMaps {
    public static void main (String[]args){
        //The min size is 16
        //The max size is 2^30
        //Load factor==0.75 if Collection is full on the 75%, then it extends twice 
        //memory hashmap vs Treemap(Winner)
        HashMap <String,String> hashMap = new HashMap<>();//Node's Array
        Map <String,String> linkedHashMap = new LinkedHashMap<>(); // Node's Array in the correct sequence
        Map <String,String> treeMap = new TreeMap<>(); //Has structure as tree // Nodes
        Map <String,String> hashTable = new Hashtable<>();
        Map <String,String> syncHashMap = Collections.synchronizedMap(new HashedMap());
        //how to store elements
        hashMap.put("1", "A");
        hashMap.put("2", "C");
        hashMap.put("3", "B");
        
        TreeMap <String,String> treeMap2 = new TreeMap<>();
        
        treeMap2.put("1","c");
        treeMap2.put("5","a");
        treeMap2.put("2","d");
        treeMap2.put("3","b");
        System.out.println(treeMap2.subMap("1", "5"));
        System.out.println(treeMap2.subMap("1", "3"));
        //
    }
}
