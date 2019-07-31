/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeyReader;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author GoD
 */
public class View2 extends JFrame{
Model2 model2 = new Model2();
	private JLabel additionLabel = new JLabel("Press Run to start keylogger");
	private JButton run = new JButton("RUN");
        private JLabel additionLabe2 = new JLabel("To finish press F12 or enter 1000 symbols");
	
	View2(){	
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(385, 200);
                 this.setLocation(700, 300);
                 this.setTitle("KeyReader");
		calcPanel.add(additionLabel);
		calcPanel.add(run);
                calcPanel.add(additionLabe2);
		this.add(calcPanel);	
	}
        public void set(){
            model2.main();
            
            
        }
        void addRunListener(ActionListener listenForCalcButton){
		run.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}


}
