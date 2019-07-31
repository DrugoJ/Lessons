
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class Main {
    public static void main(String[]args){
        
            /*FileInputStream fis = null;
            int b=0;
            try {
            fis = new FileInputStream("C:/4.txt");
            while ((b=fis.read())!=-1){
            System.out.println((char)b);
            }
            } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            } catch (IOException ee) {
            ee.printStackTrace();
            }*/
            
            /*FileInputStream fis = null;
            InputStreamReader isr = null;
            int b=0;
            try {
            fis = new FileInputStream("C:/4.txt");
            isr = new InputStreamReader(fis,"cp1251"); //Also UTF-8
            while ((b=isr.read())!=-1){
            System.out.println((char)b);
            }
            } catch (IOException ee) {
            ee.printStackTrace();
            } finally{
            try {
            fis.close();
            } catch (IOException ex) {
            ex.printStackTrace();
            }
            try {
            isr.close();
            } catch (IOException ex) {
            ex.printStackTrace();
            }
            
            }*/
            /*FileOutputStream fos = null;
            String str = "Hot";
            try {
            fos = new FileOutputStream("C:/4.txt");
            fos.write(str.getBytes());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }*/
            
        /*String str = " Boys";
        FileWriter fr = null;
        try {
            fr = new FileWriter("C:/4.txt",true);
            fr.write(str);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        } finally{
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        */
        
        /*
        String str = "Example";
        FileWriter fr = null;
        File file = new File("C:/Hello/2.txt");
        try{
            fr = new FileWriter(file,true);
            fr.write(str);
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }*/
        
    }
}
