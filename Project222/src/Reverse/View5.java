/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reverse;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author GoD
 */
public class View5 extends JFrame{
Model5 model5 = new Model5();
	private JTextField input = new JTextField(10);
	private JButton run = new JButton("REVERSE");
        private JTextField output = new JTextField(10);
	
	View5(){	
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(360, 200);
                 this.setLocation(700, 300);
                 this.setTitle("Reverse");
		calcPanel.add(input);
		calcPanel.add(run);
                calcPanel.add(output);
		this.add(calcPanel);	
	}
        public void rev(){
            output.setText(model5.rever(input.getText()));
        }
        void addRunListener(ActionListener listenForCalcButton){
		run.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}


}
