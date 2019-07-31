/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Collections.shuffle(Arrays.asList(arr));
            for(int j = 0 ;j<arr.length;j++){
                if(arr[j]==0){
                    for(int k = 0; k<arr.length;k++){
                        arr[k]++;
                    }
                }
            }*/
            /*for(int j = 0; j<4;j++){
                if(arr[j]==10){
                    arr[j]--;
                }
            }*/


///////////////////////////////

/* Integer[] arr = new Integer[9];
            for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            }
            Collections.shuffle(Arrays.asList(arr));
            String str = arr[0]+""+arr[1]+""+arr[2]+""+arr[3]+"";
            System.out.println(str);*/
package test;

import java.io.File;




/**
 *
 * @author GoD
 */
public class Test {

    public static void main(String[] args) {
        // File (or directory) with old name
        File file = new File("eesti.txt");
// File (or directory) with new name
        File file2 = new File("eesti.docx");
// Rename file (or directory)
        boolean success = file.renameTo(file2);
        if (!success) {
            System.out.println("Trouble");
        }
    }
}

    


