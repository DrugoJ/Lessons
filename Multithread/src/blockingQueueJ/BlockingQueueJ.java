/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockingQueueJ;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class BlockingQueueJ {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>(); //remove is waiting add's executing
        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
                
        }.start();
        new Thread() {
            @Override
            public void run() {
                queue.add("This is string");
            }
        }.start();
    }
}
