/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project222;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author GoD
 */
public class ModelMain {
    public boolean readData(String login, String password) throws IOException {
    
        BufferedReader brLog = null;
        BufferedReader brPass = null;
        boolean YesOrNo = false;
        try {
            brLog = new BufferedReader(new FileReader("login.txt"));
            StringBuilder sbLog = new StringBuilder();
            String lineLog = brLog.readLine();
            
            brPass = new BufferedReader(new FileReader("password.txt"));
            StringBuilder sbPass = new StringBuilder();
            String linePass = brPass.readLine();

            while (lineLog != null) {
                sbLog.append(lineLog);
                sbLog.append('\n');
                lineLog = brLog.readLine();
            }
            while(linePass != null){
                sbPass.append(linePass);
                sbPass.append("\n");
                linePass = brPass.readLine();
            }
            
            String everyLog = sbLog.toString();
            String everyPass = sbPass.toString();
            String[] logins = everyLog.split("/");
            String[] passwords = everyPass.split("/");
            for (int i = 0; i < logins.length; i++) {
                if(logins[i].equals(login)&&passwords[i].equals(password)){
                    System.out.println("Congratulations");
                    YesOrNo = true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            brLog.close();
            brPass.close();
        }
        return YesOrNo;
    }
    
}
