/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class Conditions {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;
    public static void main(String[]args){
        new AccountMinus().start();
        new AccountPlus().start();
    }
    static class AccountPlus extends Thread{

        @Override
        public void run() {
            lock.lock();
            account+=10;
            condition.signal();
            lock.unlock();
        }
        
    }
    static class AccountMinus extends Thread{
        @Override
        public void run() {
            if(account<10){
                try{
                lock.lock();
                System.out.println("account - "+account);
                condition.await();
                System.out.println("account - "+account);
                lock.unlock();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                account-=10;
                System.out.println("account at the end - "+ account);
            }
        }
        
    }
    
}
