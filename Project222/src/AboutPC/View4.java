/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AboutPC;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author GoD
 */
public class View4 extends JFrame{
        Model4 model4 = new Model4();
	private JLabel additionLabel = new JLabel("Information");
        private JTextArea info = new JTextArea(22,40);
	private JButton run = new JButton("RUN");
        private JScrollPane scrollBar = new JScrollPane();
        
	View4(){
            scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollBar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(494, 470);
                this.setLocation(700, 300);
                this.setTitle("AboutPC");
		calcPanel.add(additionLabel);
                calcPanel.add(info);
                calcPanel.add(scrollBar);
		calcPanel.add(run);
                scrollBar.getViewport().setView(info);
		this.add(calcPanel);

                
	}
        public void set(){
            info.setText(model4.information());
        }
        void addRunListener(ActionListener listenForCalcButton){
		run.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}


}
