/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AboutPC;



/**
 *
 * @author GoD
 */
public class AboutPc {
    public void run(){
    Model4 model4 = new Model4();
    View4 view4 = new View4();
    Controller4 controller4 = new Controller4(view4,model4);
    view4.setVisible(true);
   }
}
