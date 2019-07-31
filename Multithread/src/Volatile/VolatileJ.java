/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Volatile;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class VolatileJ {

    volatile static int i = 0;

    public static void main(String[] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    
    static class MyThreadWrite extends Thread {

        @Override
        public void run() {
            while(i<5){
            System.out.println("increment i to " + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    static class MyThreadRead extends Thread {

        @Override
        public void run() {
            int localVar = i;
            while(i<5){
                if(localVar!=i){
                    System.out.println("new value i is - "+i);
                    localVar=i;
                }
            }
        }

    }

}
