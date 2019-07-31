/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author GoD
 */
public class Model3 extends javax.swing.JFrame {
    public void writeData (String jtext1, String jtext2) throws IOException { 
            File fileLog = new File("login.txt");
            File filePass = new File("password.txt");
            FileWriter writeLogin = null;
            FileWriter writePass = null;
            try {
                writeLogin = new FileWriter(fileLog, true);
                writePass = new FileWriter(filePass, true);
                String usernameIN = jtext1;
                String passwordIN = jtext2;
                writeLogin.write(usernameIN);
                writePass.write(passwordIN);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                writeLogin.close();
                writePass.close();
            }
        } 
    
    
}
