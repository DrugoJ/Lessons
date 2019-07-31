/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds;

/**
 *
 * @author GoD
 */
public class Crow extends Birds{
    
    public Crow(String name, Wings wings){
        super(name, wings); // Main class's constructor
    }
    
    public void fly(){
        System.out.println("I am Crow and I'm Flying");
        
    }
}
