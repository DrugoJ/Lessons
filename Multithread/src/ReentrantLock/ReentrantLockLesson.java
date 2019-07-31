/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;




/**
 *
 * @author GoD
 */
public class ReentrantLockLesson {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i = 5;
        resource.j = 5;
        MyThread thread1 = new MyThread(); 
        MyThread thread2 = new MyThread();
        thread1.setName("one");
        thread2.setName("two");
        thread1.resource=resource;
        thread2.resource=resource;
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(resource.i);
        System.out.println(resource.j);
    }
}

class MyThread extends Thread {
    Resource resource;
    @Override
    public void run() {
        resource.changeI();
        resource.changeJ();
    }

}

class Resource {
    int i;
    int j;
    Lock lock = new ReentrantLock();
    void changeI() { //Synchronize this method or we can add synchronize block in inside method
        lock.lock();
            int i = this.i;
            i++;
            this.i = i;
    }
    void changeJ() { //Synchronize this method or we can add synchronize block in inside method
            int j = this.j;
            j++;
            this.j = j;
            lock.unlock();
    }
}
