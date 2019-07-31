/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author GoD
 */
public class View extends JFrame{
Model model = new Model();
	private JLabel additionLabel = new JLabel("Нажмите Run для включения keylogger");
	private JButton run = new JButton("RUN");
        private JLabel additionLabe2 = new JLabel("Для выключения нажмите F12 или введите 10 символов");
	
	View(){	
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(360, 200);
		calcPanel.add(additionLabel);
		calcPanel.add(run);
                calcPanel.add(additionLabe2);
		this.add(calcPanel);	
	}
        public void set(){
            model.main();
        }
        void addRunListener(ActionListener listenForCalcButton){
		run.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}


}
