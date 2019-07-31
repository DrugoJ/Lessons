/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitAndNotify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class WaitAndNotify2 {

    static List<String> strings = new ArrayList();

    public static void main(String[] args) {
new Operator().start();
new Machine().start();
    }

    static class Operator extends Thread {

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            while (true) {
                synchronized (strings) {
                    strings.add(sc.nextLine());
                    strings.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    static class Machine extends Thread {

        @Override
        public void run() {
            while (strings.isEmpty()){
               synchronized(strings){
                   try {
                       strings.wait();
                   } catch (InterruptedException ex) {
                       ex.printStackTrace();
                   }
                   System.out.println(strings.remove(0));
                   }
            }
        }

    }
}
