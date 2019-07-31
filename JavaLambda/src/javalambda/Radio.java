/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda;

/**
 *
 * @author GoD
 */
public class Radio implements Electricity{
    public void playMusic(){
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
