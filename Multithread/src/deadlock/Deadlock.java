/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

import java.lang.management.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class Deadlock {

    public static void main(String[]args) throws InterruptedException{
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.resA = resourceA;
        myThread2.resB = resourceB;
        myThread1.start();
        myThread2.start();
        
        Thread.sleep(1000);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();
        if(deadlockedThreads!=null){
            ThreadInfo[] threadInfo = threadMXBean.getThreadInfo(deadlockedThreads);
            for(ThreadInfo info : threadInfo){
                System.out.println(info);
            }
        }
    }

}

class MyThread1 extends Thread{
    ResourceA resA;
    @Override
    public void run() {
        System.out.println(resA.getI());
    } 
}
class MyThread2 extends Thread{
    ResourceB resB;
    @Override
    public void run() {
        System.out.println(resB.getI());
    } 
}

class ResourceA{
    
    ResourceB resourceB;
    public synchronized int getI(){
        return resourceB.returnI();
    }
    public synchronized int returnI(){
        return 1;
    }
    
}
class ResourceB{
    
    ResourceA resourceA;
    public synchronized int getI(){
        return resourceA.returnI();
    }
    public synchronized int returnI(){
        return 1;
    }
    
}
