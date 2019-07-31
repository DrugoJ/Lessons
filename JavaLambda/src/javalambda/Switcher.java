/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author GoD
 */
public class Switcher {
    private List <Electricity> electricity = new ArrayList<>();
    public void addElectricityListener(Electricity listener){     
        electricity.add(listener);
    }
    public void removeElectricityListener(Electricity listener){     
        electricity.remove(listener);
    }
    
    

    public void switchOn(){
        System.out.println("Switch on");
        /*if(electricity!=null){
            electricity.
        }*/
        for(Electricity c : electricity){
            c.electricityOn();
        }
    }
}

