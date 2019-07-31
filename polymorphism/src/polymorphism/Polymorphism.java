/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;
import birds.Birds;
import birds.Crow;
import birds.Ostrich;
import birds.Test;
/**
 *
 * @author GoD
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.walk();
        Ostrich ostrich = new Ostrich();
        Crow crow = new Crow();
        ostrich.walk();
        System.out.println("///////////");
        Birds crow2 = new Crow();
        Birds ostrich2 = new Ostrich();
        Test test = new Test();
        test.foo(ostrich2);//interesting
        test.foo(crow2);//interesting
    }
    
}
