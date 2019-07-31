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
public class StaticSynch {
     public static void main(String[] args) throws Exception {
        ResourceS.i = 5;
        MyThread3S thread1 = new MyThread3S(); 
        MyThread3S thread2 = new MyThread3S();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(ResourceS.i);
        
    }
}
class MyThread3S extends Thread{
    ResourceS resourceS;
    
    @Override
    public void run() {
        resourceS.changeStaticI();
    }
    
}
//NEVER EXECUTE STATIC AND NO-STATIC METHOD
class ResourceS{
    static int i;

    public synchronized static void changeStaticI(){ //Synchronize this method or we can add synchronize block in inside method
        int i = ResourceS.i;
        i++;
        ResourceS.i = i;
    }
}
