/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkJoinFramework;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author GoD
 */
public class ForkJoinFrameworkJ {
    static long numOfOperations = 10_000_000_000L;
    static int numOfThread = Runtime.getRuntime().availableProcessors();
    public static void main(String[]args)throws Exception{
        /*long j = 0;
        for(long i = 0;i<numOfOperations;i++){
            j+=i;
        }*/
        ForkJoinPool pool = new ForkJoinPool(numOfThread);
        System.out.println(pool.invoke(new MyFork(0,numOfOperations)));
    }
    
    static class MyFork extends RecursiveTask<Long>{  
        long from,to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }
        
        @Override
        protected Long compute() {
            if(to-from<=numOfOperations/numOfThread){
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;
                }
                return j;
            }
            else{
                long midle = (to+from)/2;
                MyFork firstHalf = new MyFork(from, midle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(midle + 1,to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
            
        }       
    }
    
}
