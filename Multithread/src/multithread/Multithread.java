/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author GoD
 */
public class Multithread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new MyThread().start();
        new MyThread().start();
        myThread.start();
    }

}

class MyThread extends Thread {

    @Override //Necessarily
    public void run(){
        for (int i = 0;i<100;i++){
            System.out.println("Thread name is - "+Thread.currentThread().getName()+" number is "+i);
        }
    }
}
