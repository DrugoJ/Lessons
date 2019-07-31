/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BullsCows;

import BullsCows.Model;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

/**
 *
 * @author GoD
 */
public class View extends JFrame{
Model model = new Model();
String rnd = model.getRnd();
	private JTextField input = new JTextField(10);
	private JButton run = new JButton("RUN");
        private JTextField output = new JTextField(10);
	
	View(){	
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(360, 200);
                this.setLocation(700, 300);
                this.setTitle("BullsCows");
		calcPanel.add(input);
		calcPanel.add(run);
                calcPanel.add(output);
		this.add(calcPanel);	
	}
        public void set(){
            if(input.getText().length()==4){
                output.setText(model.getHint(rnd, input.getText()));
            }
            else{
            JOptionPane.showMessageDialog(new View(), "Please enter the four numbers", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
        }
        void addRunListener(ActionListener listenForCalcButton){
		run.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}


}
