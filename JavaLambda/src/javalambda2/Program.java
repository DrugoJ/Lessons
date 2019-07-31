/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GoD
 */
public class Program {
    public static void main(String[]args){
        List<Person> nums = new ArrayList<Person>();
        nums.add(new Person("Kirill",18));
        nums.add(new Person("Alex",32));
        nums.add(new Person("Kenny",20));
        nums.add(new Person("Kaleo",16));
        nums.add(new Person("Grey",21));
        //System.out.println(nums);
        //nums.stream().forEach((Person p)->{System.out.println(p);}); //LAMBDA
        
        /*nums.stream().filter(p ->{
            return p.getAge() >=18;
        }).forEach(System.out::println);*/
        nums.stream().
        sorted((p1,p2)->p1.getName().compareTo(p2.getName())).
        filter(p ->p.getAge() >=18).
        forEach(System.out::println); //LAMBDA
        
    }
}
