/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egor;



/**
 *
 * @author GoD
 */
public class Controller {
    private Model theModel = new Model();
    private NewJFrame theView = new NewJFrame();
    public Controller(NewJFrame theView, Model theModel) {
		this.theView = theView;
		this.theModel = theModel;
	}
    }
