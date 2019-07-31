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
public class SamsungNote  extends Samsung {

    
    @Override
    public String getDescription() {
       this.setName("SamsungNote");
       this.setCountry("Russia");
       return this.getName() + " " + this.getCountry();
    }
    
}
