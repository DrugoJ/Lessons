/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import phones.Apple;

/**
 *
 * @author GoD
 */
public class Iphone6S extends Apple {

    @Override
    public String getDescription() {
        this.setName("Iphone6S");
        this.setCountry("USA");
        return this.getName() + " " + this.getCountry();
    }
    
}
