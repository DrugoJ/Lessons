/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda;

/**
 *
 * @author GoD
 */
public class JavaLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        //event subscribe
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);
        //ANONYMOUS CLASS
        /*sw.addElectricityListener(new Electricity() {
            public void electricityOn() {
                System.out.println("Fire"); 
            }
        });*/
        sw.switchOn();
        String message = "Fire, Radio "; //can not be changed
        //LAMBDA
        sw.addElectricityListener(()->{             
                System.out.print(message);
                System.out.println("have broken");
                }
        );
        //sw.addElectricityListener(()->JavaLambda.fire());
        //sw.addElectricityListener(JavaLambda::fire);
        sw.removeElectricityListener(radio);
        sw.switchOn();
        
    }
    public static void fire(){
        System.out.println("Fire");
    }
    
    
}
