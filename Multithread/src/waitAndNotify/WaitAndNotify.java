/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitAndNotify;

/**
 *
 * @author GoD
 */
public class WaitAndNotify {
    public static void main (String[]args) throws InterruptedException{
        MyThread myThread = new MyThread();
        myThread.start();
        synchronized (myThread){
        myThread.wait();
        }
        System.out.println(myThread.total);
    }
}
class MyThread extends Thread{
int total;
        @Override
        public void run() {
            synchronized(this){
                for(int i=0;i<5;i++){
                    total +=i;
                }
                notify();
            }
        } 
    }
