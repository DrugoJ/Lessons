/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfinalclasses;

/**
 *
 * @author GoD
 */
public class AbstractFinalClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car a6 = new Audi() {};
       a6.drive();
       a6.stop();
    }
    
}

abstract class Car{
    int speed;
    abstract void drive();
    abstract void stop ();
}

class Audi extends Car{
    @Override
    void drive(){
        speed = 60;
    }
    @Override
    void stop() {
        speed = 0;
    }
}
