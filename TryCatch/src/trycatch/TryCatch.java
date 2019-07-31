/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author GoD
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ErrorExample errorEx = new ErrorExample();
        //errorEx.foo(); // ArithmeticException
        //errorEx.foo2(); // ArrayIndexOutOfBoundsException
        //errorEx.foo3(); // NullPointerException
        //errorEx.foo4(); // Much Exceptions
        errorEx.foo5();
    }
    
}
