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
public class Multithread2 {
     public static void main(String[] args) throws Exception {
        MyThread2 myThread = new MyThread2();
        myThread.start();
        //Thread.sleep(1000); //One second sleeping
        myThread.join(); //Waits this thread finishing
        System.out.println("Main Thread");
    }

}

class MyThread2 extends Thread {

    @Override //Necessarily
    public void run(){
        for (int i = 0;i<5;i++){
            System.out.println("Thread name is - "+Thread.currentThread().getName()+" number is "+i);
        }
    }
}
