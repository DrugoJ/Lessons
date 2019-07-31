/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import phones.Samsung;

/**
 *
 * @author GoD
 */
public class SamsungS6 extends Samsung {

    @Override
    public String getDescription() {
        this.setName("SamsungS6");
        this.setCountry("USA");
        return this.getName() + " " + this.getCountry();
    }
    
}
