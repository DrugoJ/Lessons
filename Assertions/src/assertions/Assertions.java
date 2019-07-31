/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertions;

/**
 *
 * @author GoD
 */
public class Assertions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assertions asert = new Assertions();            //new Assertions().someMethod(0);
        asert.someMethod(0);
        
    }
    private void someMethod(int a){
        assert(a > 0);
        System.out.print(a);
    }
    
}
