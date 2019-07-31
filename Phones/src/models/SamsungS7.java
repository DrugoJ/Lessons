/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import phones.Samsung;

/**
 *
 * @author user
 */
public class SamsungS7 extends Samsung {
    
    @Override
    public String getDescription() {
        this.setName("Samsung S7 Edge");
        this.setCountry("USA");
        return this.getName() + " " + this.getCountry();
    }
    
}
