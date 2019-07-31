/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AboutPC;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GoD
 */
public class Controller4 {
    private Model4 theModel = new Model4();
    private View4 theView = new View4();
    public Controller4(View4 theView, Model4 theModel) {
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
