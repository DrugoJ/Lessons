/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesearch;

/**
 *
 * @author GoD
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSearch {

	public static void main(String[] args) {
            File dir = new File("C:\\");
      String[] children = dir.list();
      
      if (children == null) {
         System.out.println("does not exist or is not a directory");
      } else {
         for (int i = 0; i < children.length; i++) {
            String filename = children[i];
            if(filename.contains(".")){
            System.out.println(filename+" - file");
            }
            else{
                System.out.println(filename+" - folder");
            }
         }
      }
	}


}

