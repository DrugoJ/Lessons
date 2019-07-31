/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Synchronization;

/**
 *
 * @author GoD
 */
public class Synchronization {
     public static void main(String[] args) throws Exception {
        Resource resource = new Resource();
        resource.i = 5;
        MyThread3 thread1 = new MyThread3(); 
        MyThread3 thread2 = new MyThread3();
        thread1.setResouce(resource);
        thread2.setResouce(resource);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(resource.i);
        
    }
}
class MyThread3 extends Thread{
    Resource resource;

    public void setResouce(Resource resouce) {
        this.resource = resouce;
    }
    
    @Override
    public void run() {
        resource.changeI();
    }
    
}
class Resource{
    int i;
    public int getI() {
        return i;
    }

    public /*synchronized*/ void changeI(){ //Synchronize this method or we can add synchronize block in inside method
        synchronized (this){ 
        int i = this.i;
        i++;
        this.i = i;
        }
    }
}
