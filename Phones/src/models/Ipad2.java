/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import phones.Apple;

/**
 *
 * @author user
 */
public class Ipad2 extends Apple{
    

    @Override
    public String getDescription() {
        this.setName("Ipad2");
        this.setCountry("Russia");
        return this.getName() + " " + this.getCountry();
    }
    
}
