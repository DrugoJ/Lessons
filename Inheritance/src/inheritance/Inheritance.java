/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import inheritance.Person.Adult;
import inheritance.Person.Child;

/**
 *
 * @author GoD
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inheritance inh = new Inheritance();
        Person person = new Person();
        Child Kirill = person.new Child();
        Adult Max = person.new Adult();
        Kirill.Education = "Vocational Training Center";
        Max.work = "Economist";   
    }
    
}
