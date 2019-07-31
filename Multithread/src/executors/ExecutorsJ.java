/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author GoD
 */
public class ExecutorsJ {
    public static void main(String[]args) throws InterruptedException, ExecutionException{
        ExecutorService executorService = /*Executors.newSingleThreadExecutor() *//*Executors.newCachedThreadPool()*/Executors.newFixedThreadPool(3);
        executorService.submit(new MyRunnable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();
    }
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(1);
        }
        
    }
    static class MyCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            return "2";
        }


        
    }
}
