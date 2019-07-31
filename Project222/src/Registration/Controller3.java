/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class Controller3 {
    private Model3 theModel = new Model3();
    private View3 theView = new View3();
    public Controller3(View3 theView, Model3 theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addRunListener(new Listener());
	}
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
                    try {
                        theView.write();
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Controller3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }