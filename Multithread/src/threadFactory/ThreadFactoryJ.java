/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadFactory;

import java.util.concurrent.ThreadFactory;

/**
 *
 * @author GoD
 */
public class ThreadFactoryJ {
    public static void main(String[]args){
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
        threadFactory.newThread(new MyRun()).start();
        threadFactory.newThread(new MyRun2()).start();
        threadFactory.newThread(new MyRun()).start();
    }
    static class MyRun implements Runnable{

        @Override
        public void run() {
            System.out.println(1);
        }
        
    }
    static class MyRun2 implements Runnable{

        @Override
        public void run() {
            System.out.println(2);
        }
        
    }
}
