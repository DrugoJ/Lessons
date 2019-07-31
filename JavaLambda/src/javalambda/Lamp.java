/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class Lamp implements Electricity{
    public void lightOn(){
        System.out.println("Light On");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
