/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloning;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class Cloning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DollySheep dollySheep = new DollySheep();
        DollySheep dollySheep2 = foo(dollySheep);
        dollySheep.setName("Dolly - one");
        dollySheep2.setName("Dolly - two");
        System.out.println(dollySheep.getName());
        System.out.println(dollySheep2.getName());
    }
    public static DollySheep foo(DollySheep dollySheep2){
        DollySheep dollySheepClone = null;
        try {
            dollySheepClone = (DollySheep)dollySheep2.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Cloning.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dollySheepClone;
    }
    
}
