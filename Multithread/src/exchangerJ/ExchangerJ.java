package exchangerJ;


import java.util.concurrent.Exchanger;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class ExchangerJ {
    public static void main(String[]args) throws InterruptedException{
        Exchanger<String> exchanger = new Exchanger<>();
        
        new Mike(exchanger);
        new Anket(exchanger);
    }
    static class Mike extends Thread{
        Exchanger <String>exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Hi, i am going to walk");
                sleep(3000);
                exchanger.exchange("Hi, i'll be back");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    static class Anket extends Thread{
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
           try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        
    }
}
