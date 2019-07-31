/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author GoD
 */
public class AtomicVariable {
    static AtomicInteger i = new AtomicInteger(0);
    
    public static void main(String[]args) throws InterruptedException{
        for(int j = 0; j<10_000;j++){
            new MyThread().start();
        }
        Thread.sleep(100);
        System.out.println(i.get());
    }
    
    static class MyThread extends Thread{
        @Override
        public void run() {
            i.incrementAndGet();
        }
    }
}
