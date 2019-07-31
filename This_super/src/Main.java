
import birds.Birds;
import birds.Crow;
import birds.Ostrich;
import birds.Wings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class Main {
    public static void main (String[]args){
        Wings wings = new Wings();
        Wings bad = new Wings();
        Ostrich ostrich = new Ostrich("Sanja",wings);//Second version
        Crow crow = new Crow("Igor",wings);
        System.out.println(crow.getName());
        crow.setName("Crow");
        System.out.println(crow.getName());
        System.out.println(crow.getWings());
        ostrich.setWings(bad);
        System.out.println(crow.getWings());
        crow.fly();
        crow.walk();
    }
    
}
