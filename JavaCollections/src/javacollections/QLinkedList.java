/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author GoD
 */
public class QLinkedList {
    public static void main(String[]args){
        LinkedList <Person> list = new LinkedList<>(); 
  
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");
        Person person3 = new Person("is Good");
        
        list.add(person1);
        list.add(person2);
        list.add(person3);
        
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
    
}
