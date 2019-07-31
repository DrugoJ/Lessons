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
    public void hide (){
        System.out.println("I ostrich and i scared");
    }
    /*public void walk(String str){
        int a = 5 ;    //STATIC POLYMORPHISM
        System.out.println(a);
    }*/

    @Override
    public void walk() {
        System.out.println("Ostrich walking"); // DYNAMIC POLYMORPHISM
    }
    
}
