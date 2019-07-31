/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reverse;

/**
 *
 * @author GoD
 */
public class Model5 {
    public String rever(String stroka){
        String out = new StringBuilder(stroka).reverse().toString();
        return out;
    }
}
