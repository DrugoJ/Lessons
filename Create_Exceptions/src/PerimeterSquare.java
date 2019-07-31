
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
public class PerimeterSquare {
    public void getPerimeter(String str) throws pException{
        Square square = new Square();
        try {
            double s = Double.parseDouble(str);
            square.setSide(-2);
        } catch (NumberFormatException e){
            throw new pException("String is incorrect",e);
        }catch (pException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
