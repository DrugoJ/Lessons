/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
	}
}
