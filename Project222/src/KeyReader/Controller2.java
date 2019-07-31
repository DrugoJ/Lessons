/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeyReader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GoD
 */
public class Controller2 {
    private Model2 theModel = new Model2();
    private View2 theView = new View2();
    public Controller2(View2 theView, Model2 theModel) {
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
