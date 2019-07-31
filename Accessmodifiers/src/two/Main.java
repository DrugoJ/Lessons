/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two;

import one.Test;

/**
 *
 * @author GoD
 */
public class Main {

    public static void main (String[]args){
        Test test = new Test();
        System.out.println(test.l+" - public"+" -------- all classes from other package");   
        test.method();
        
    }
    
}
