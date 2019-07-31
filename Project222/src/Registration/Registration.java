/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

/**
 *
 * @author GoD
 */
public class Registration {
    public void runReg(){
        Model3 model3 = new Model3();
        View3 view3 = new View3();
        Controller3 controller3 = new Controller3(view3,model3);
        view3.setVisible(true);
        
    }
}
