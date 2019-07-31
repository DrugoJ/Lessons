/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.InvalidObjectException; 

public class Test { 
    public static void main(String[] args) {
        Serializator ser = new Serializator();
        /*Cat cat = new Cat(); 
        cat.setName("Sergey"); 
        System.out.println(ser.Serialization(cat));*/
        try {
            Cat cat = ser.deserialization();
            System.out.println(cat.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
