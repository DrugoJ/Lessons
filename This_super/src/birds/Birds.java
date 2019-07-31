/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds;

/**
 *
 * @author GoD
 */
public class Birds {
    private String name;
    private Wings wings;

    public Birds(String name, Wings wings) {
        this.name = name;
        this.wings = wings;
    }
    
    public void walk(){
        System.out.println("Walking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
    
    
}
