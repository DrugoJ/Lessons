/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reverse;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GoD
 */
public class Controller5 {
    private Model5 theModel = new Model5();
    private View5 theView = new View5();
    public Controller5(View5 theView, Model5 theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addRunListener(new Listener());
	}
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
                    theView.rev();
                }
            }
}
