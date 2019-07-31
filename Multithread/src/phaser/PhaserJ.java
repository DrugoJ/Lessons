/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phaser;

import java.util.concurrent.Phaser;

/**
 *
 * @author GoD
 */
public class PhaserJ {
    public static void main(String[]args){
        Phaser phaser = new Phaser(2);
        new Washer(phaser);
        new Washer(phaser);
    }
    static class Washer extends Thread{
        Phaser phaser;

        public Washer(Phaser phaser) {
            this.phaser = phaser;
            start();
        }

        @Override
        public void run() {
            for(int i = 0;i<3;i++){
                System.out.println(getName()+ " washing the "+i+" car");
                phaser.arriveAndAwaitAdvance();
            }
        }
        
        
    }
}
