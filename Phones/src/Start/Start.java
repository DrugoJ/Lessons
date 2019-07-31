/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import Fabrics.MobileFactory;
import Fabrics.RussiaFactory;
import Fabrics.UsaFactory;
import phones.Apple;
import phones.Samsung;

/**
 *
 * @author user
 */
public class Start {
    public static void main(String[]args){
        MobileFactory engineryFactory = new RussiaFactory();
        System.out.println("Russia enginery:");
	        showEnginery(engineryFactory);
	        System.out.println();
	 
        System.out.println("USA enginery:");
	        engineryFactory = new UsaFactory();
	        showEnginery(engineryFactory);


    }
    public static void showEnginery(MobileFactory mobileFactory) {
        
	        Samsung samsung[] = mobileFactory.createSamsung();
                for(int i  = 0;i<samsung.length;i++){
	        System.out.println(samsung[i].getDescription());
                }
                
	        Apple apple[] = mobileFactory.createApple();
                for(int j  = 0;j<samsung.length;j++){
	        System.out.println(apple[j].getDescription());
                }
	    }

}
