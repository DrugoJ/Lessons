/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author GoD
 */
public class Person {
    String name;
    int weight;
    int height;
    
    
        public class Child extends Person{
            String Education;
            public void characters(){
                
            }
        }
        
        public class Adult extends Person{
            String work; 
            public void characters(){
                
            }
        }
        
}
