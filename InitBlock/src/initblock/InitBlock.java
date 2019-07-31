/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initblock;

/**
 *
 * @author GoD
 */
class Parent{
    static{
        System.out.println("static parent block");
    }
    Parent(){
       System.out.println("Parent constructor");
    }
}
public class InitBlock extends Parent{

    static{
        System.out.println("static block");
    }
    {
        System.out.println("initblock1");
    }
    {
        System.out.println("initblock2");
    }
    InitBlock(){
        super(); //Constructor of super class
        System.out.println("Constructor");
    }
    {
        System.out.println("initblock3");
    }
    public static void main(String[] args) {
        new InitBlock();
    }
    
}
