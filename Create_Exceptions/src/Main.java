
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class Main {
    public static void main(String[]args){
       PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter("g");
        } catch (pException ex) {
            ex.printStackTrace();
        }
    }
}
