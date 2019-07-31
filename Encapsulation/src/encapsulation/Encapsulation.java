/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author GoD
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getCharacters());
    }
}
class Person{
    private String name = "Kirill";
    private String surName = "Kuzmin";
    private int age = 18;

    public String getCharacters(){
        return name+" "+surName+" "+age;
    }   
    
}