/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trylock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class TryLock {
    static Lock lock = new ReentrantLock();
    public static void main(String[]args){
        new Thread1().start();
        new Thread2().start();
    }
    static class Thread1 extends Thread{

        @Override
        public void run() {
            lock.lock();
            System.out.println(getName()+" Start working");
            /*try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }*/
            System.out.println(getName()+" Stop working");
            lock.unlock();
            System.out.println(" Lock is released");
        }
        
    }
    static class Thread2 extends Thread{

        @Override
        public void run() {
            System.out.println(getName()+" Begin working");
            if (lock.tryLock()){
                System.out.println(getName()+" Working");
            }
            else{
                System.out.println(getName()+" Waiting");
            }
        }
        
    }
    
}
