/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semofors;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class SemoforsJ {

    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);
        
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        
        person1.table = table;
        person2.table = table;
        person3.table = table;
        person4.table = table;
        person5.table = table;
        person6.table = table;
        
        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        
    }
}

class Person extends Thread {

    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " Waiting for table");
        try {
            table.acquire();
            System.out.println(this.getName()+" Eat at the table");
            this.sleep(1000);
            System.out.println(this.getName()+ " Release table");
            table.release();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
