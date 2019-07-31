/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloning;

/**
 *
 * @author GoD
 */
public class DollySheep implements Cloneable {
    private String name;
    private Head head = new Head();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
}
