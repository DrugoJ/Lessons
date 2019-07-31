/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.Externalizable;
import java.io.Serializable;

public class Cat implements Serializable { //OR Externalizable 

    private String name;

    private static String a = "Hi"; //can't be serializable 
    private transient String b = "asd"; //can't be serializable 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
