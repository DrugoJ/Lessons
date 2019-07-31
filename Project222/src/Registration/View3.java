/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;


/**
 *
 * @author GoD
 */
public class View3 extends JFrame {

    Model3 model3 = new Model3();
    private JLabel userNameL = new JLabel("Username");
    private JTextField user = new JTextField(20);
    private JLabel userPasswordL = new JLabel("Password");
    private JTextField password = new JTextField(20);
    private JButton run = new JButton("RUN");

    View3() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(360, 200);
         this.setLocation(700, 300);
        this.setTitle("Registration");
        calcPanel.add(userNameL);
        calcPanel.add(user);
        calcPanel.add(userPasswordL);
        calcPanel.add(password);
        calcPanel.add(run);
        this.add(calcPanel);
    }

    public void write() throws IOException {
        String str1 = user.getText();
        String str2 = password.getText();
        if(str1.equals("")||str2.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter login and password", "Dialog",JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                model3.writeData(user.getText()+"/",password.getText()+"/");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.setVisible(false);
            dispose();
        }
    }

    void addRunListener(ActionListener listenForCalcButton) {
        run.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
