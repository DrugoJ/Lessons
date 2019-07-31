/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicBarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author GoD
 */
public class CyclicBarierJ {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());
        new Sportsmen(cyclicBarrier);
        new Sportsmen(cyclicBarrier);
        new Sportsmen(cyclicBarrier);
    }

    static class Run extends Thread {

        @Override
        public void run() {
            System.out.println("Run is begun");
        }

    }

    static class Sportsmen extends Thread {

        CyclicBarrier barrier;

        public Sportsmen(CyclicBarrier barrier) {
            this.barrier = barrier;
            start();
        }

        @Override
        public void run() {
            try {
                barrier.await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } catch (BrokenBarrierException ex) {
                ex.printStackTrace();
            }
        }

    }
}
