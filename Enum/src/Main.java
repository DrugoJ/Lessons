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
    public static void main(String[]args){
       Music mc = Music.ROCK;
       //Music mc2 = Music.valueOf(Music.class,"ROCK"); // the same as first
        /*System.out.println(mc);//print the array's element
        System.out.println(mc2);//print the array's element
        System.out.println(mc.ordinal()); //print number of the array's element*/
        /*for(Music elements:Music.values()){
            System.out.println(elements);
        }*/
        
        
        /*switch(mc){
            case JAZZ:
                System.out.println("MUSIC - JAZZ");
            break;
            case ROCK:
                System.out.println("MUSIC - ROCK");
            break;
            case POP:
                System.out.println("MUSIC - POP");
            break;
        }*/
        
        System.out.println(mc.getI());
        System.out.println(mc.getName());
        mc.foo();
        
        
    }
}
