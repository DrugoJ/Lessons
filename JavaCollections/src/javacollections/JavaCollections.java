/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author GoD
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(); //array's size in brackets
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");
        //addAll is adding new Collection in exist
        System.out.println("Is empty? - "+list.isEmpty());
        
        list.add(person1);
        list.add(person2);
        
        Iterator <Person> iterator = list.iterator();
        
        while(iterator.hasNext()){
            Person  iterPerson = iterator.next(); //for each
             System.out.println(iterPerson);
        }
        
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove(); //for each
        }
        
        
        while(iterator.hasNext()){
            Person  iterPerson = iterator.next(); //will not be does, after remove
             System.out.println("a"+iterPerson);
        }
        
        System.out.println("Size is "+list.size());
        
        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);
        
        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);
        
        System.out.println("Does list contains the Object? " +list.contains(person2));
        
        System.out.println(list.indexOf(person1));
        
        boolean remove = list.remove(person1);      
        System.out.println(remove);
        
        Person person1FromCollectionAfterRemove = list.get(0);
        System.out.println("person1FromCollectionAfterRemove = "+person1FromCollectionAfterRemove); //after 1 element's removing, collection will be change
        
        System.out.println("Is empty? - "+list.isEmpty());
        list.clear();
        System.out.println("Is empty? - "+list.isEmpty());
        
        
        
        

        
        
    }
    
}
