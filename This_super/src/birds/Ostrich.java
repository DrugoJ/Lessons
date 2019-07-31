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
public class Ostrich extends Birds{

    public Ostrich(String name, Wings wings) {
        super(name, wings);
    }
    
    public void hide (){
        System.out.println("I ostrich and i scared");
    }
}
