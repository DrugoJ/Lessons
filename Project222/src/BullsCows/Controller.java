/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BullsCows;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GoD
 */
public class Controller {
    private Model theModel = new Model();
    private View theView = new View();
    public Controller(View theView, Model theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addRunListener(new Listener());
	}
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
                    theView.set();
                }
            }
}
