/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brutforce;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author GoD
 */
public class BrutForce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> fibonaciNumbers = new ArrayList<>();
        fibonaciNumbers.add(0,1);
        fibonaciNumbers.add(1,1);
        for (int i = 1; i < 10; i++) {
            int previousNumber = fibonaciNumbers.get(i);
            int doublePreviousNumber = fibonaciNumbers.get(i-1);
            fibonaciNumbers.add(i+1,previousNumber+doublePreviousNumber);
        }
        System.out.println(fibonaciNumbers.toString());
    }
    
}
