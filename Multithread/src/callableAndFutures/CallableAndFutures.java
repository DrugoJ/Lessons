/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callableAndFutures;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 * @author GoD
 */
public class CallableAndFutures {
    public static void main(String[]args) throws InterruptedException, ExecutionException{
        Callable<Integer> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
    static class MyCallable implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            int j = 0;
            for(int i = 0; i<10;i++,j++){
                Thread.sleep(300);
            }
            return j;
        }      
    }
}
