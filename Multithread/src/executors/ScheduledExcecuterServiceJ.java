/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author GoD
 */
public class ScheduledExcecuterServiceJ {
    public static void main(String[]args){
        ScheduledExecutorService seService = Executors.newSingleThreadScheduledExecutor();
        seService.schedule(new MyThread(), 5, TimeUnit.SECONDS);
        seService.shutdown();
    }
    static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println(1);
        }
        
    }
}
