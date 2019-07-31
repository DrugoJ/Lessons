/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class CountDownLatchJ {
    public static void main(String[]args) throws InterruptedException{
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);
        countDownLatch.await();
        System.out.println("All job done");
    }
}
class Work extends Thread{
CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Done work");
        countDownLatch.countDown();
    }
    
}
