/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcaleksei;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
/**
 *
 * @author GoD
 */
public class View extends JFrame{ 
Model model = new Model(); 
private JTextField input = new JTextField(10); 
private JTextField output = new JTextField(30); 
private JButton run = new JButton("RUN"); 
View(){ 
JPanel calcPanel = new JPanel(); 
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
this.setSize(600, 200); 

calcPanel.add(input); 
calcPanel.add(run); 
calcPanel.add(output); 

this.add(calcPanel); 
} 

public void set(){ 
output.setText(model.main(Integer.parseInt(input.getText()))); 
} 
void addListener(ActionListener listenForCalcButton){ 
run.addActionListener(listenForCalcButton); 
} 
void displayErrorMessage(String errorMessage){ 
JOptionPane.showMessageDialog(this, errorMessage); 
} 


}
