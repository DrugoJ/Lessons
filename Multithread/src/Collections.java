
import java.io.*; 
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class Collections {

    public static void main(String[] args) throws IOException {
        NameList nameL = new NameList();
        nameL.add("First");
        
        class MyThread extends Thread {

            @Override
            public void run() {
                System.out.println(nameL.removeFirst());
            }
        }
        new MyThread().start();
        new MyThread().start();
    }

    static class NameList {

        List synList = new ArrayList<>();

        public synchronized void add(String name) {
            synList.add(name);
        }

        public synchronized String removeFirst() { //Synchronized - is mandatory term
            if (synList.size() > 0) {
                return (String) synList.remove(0);
            }
            return null;
        }
    }
}
