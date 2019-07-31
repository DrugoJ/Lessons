/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeyReader;

/**
 *
 * @author GoD
 */
public class KeyReader {
    public void runKey(){  
        Model2 model2 = new Model2();
        View2 view2 = new View2();
        Controller2 controller = new Controller2(view2, model2);
        view2.setVisible(true);
    }   
}
