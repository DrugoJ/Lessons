
import java.io.*;
import java.nio.file.Files;
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
public class Model {
    String str;
    String every;
    public String returnScheme(int count) throws IOException{
        
        switch(count){
            case 1: str="D:\\Test\\Schemes\\1.txt";
                break;
            case 2: str="D:\\Test\\Schemes\\2.txt";
                break;
            case 3: str="D:\\Test\\Schemes\\3.txt";
                break;
            case 4: str="D:\\Test\\Schemes\\4.txt";
                break;
            case 5: str="D:\\Test\\Schemes\\5.txt";
                break;
            case 6: str="D:\\Test\\Schemes\\6.txt";
                break;
            default: str="Deffault";
                System.out.println("Error");
                break;
        }
        BufferedReader br = null;
        try{
            br = new BufferedReader (new InputStreamReader(new FileInputStream(str), "cp1251"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append('\n');
                line = br.readLine();
            }
            every = sb.toString();
        }
        catch (Exception e){
            e.printStackTrace();
        } finally{
            br.close();
        }
        return every; 
        
    }
    public void save(int r) throws IOException{
    File dest = new File("D:\\Test\\MyTrain.jpg");
    File source = new File("D:\\Test\\images\\1.jpg");
    switch(r){
            case 1: source = new File("D:\\Test\\images\\1.jpg");
                break;
            case 2: source = new File("D:\\Test\\images\\2.jpg");
                break;
            case 3: source = new File("D:\\Test\\images\\3.jpg");
                break;
            case 4: source = new File("D:\\Test\\images\\4.jpg");
                break;
            case 5: source = new File("D:\\Test\\images\\5.jpg");
                break;
            case 6: source = new File("D:\\Test\\images\\6.jpg");
                break;
            default: str="Deffault";
                System.out.println("Error");
                break;
    }
    Files.copy(source.toPath(), dest.toPath());
    }
    
}
