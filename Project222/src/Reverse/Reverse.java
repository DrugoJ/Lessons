/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reverse;

/**
 *
 * @author GoD
 */
public class Reverse {
    public void run5(){
        Model5 model = new Model5();
        View5 view = new View5();
        Controller5 controller = new Controller5(view,model);
        view.setVisible(true);
    }
}
