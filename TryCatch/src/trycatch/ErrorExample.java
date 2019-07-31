/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GoD
 */
public class ErrorExample {
    private ABC abc ;
    public void foo(){
        try{
        System.out.println(1/0);
        }catch(ArithmeticException e){
            System.err.println("Деление на ноль");
        }
    }
    public void foo2(){
        int mass [] = {1,2,3};
        try{
        mass[5] = 3;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    public void foo3(){
        try{
          abc.show();  
        } catch(NullPointerException e){
            e.printStackTrace();
        }
        
    }
    public void foo4(){
        try{
          abc.show();  
          System.out.println(1/0);}
        /*} catch(NullPointerException e){
            e.printStackTrace();
        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }*/
        
        ///////////OR///////////////
        catch(NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }
        
    }
    public void foo5(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream ("");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
