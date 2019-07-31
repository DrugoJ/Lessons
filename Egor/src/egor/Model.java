/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egor;

/**
 *
 * @author GoD
 */
public class Model {
    public String run (double type, double gender, String mass, String amount){
        double massD = Double.parseDouble(mass);
        double amountD = Double.parseDouble(amount);
        double result = ((type*amountD)/(massD*gender));
        result = result*100;
        result = Math.round(result);
        result = result/100;
        String resultF = Double.toString(result);
        return resultF;
    }
}
