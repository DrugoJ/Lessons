/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author GoD
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] mass = new int[10];
        int [] mass2 = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<mass2.length;i++){
            System.out.println(mass2[i]);
        }
        /////////
        Candy [] box = new Candy[10];
        Candy candyFirst = new Candy();
        Candy candySecond = new Candy();
        Candy candyThird = new Candy();
        Candy [] box2 = {candyFirst, candySecond, candyThird};
        for (int i = 0; i<box2.length;i++){
            System.out.println(box2[i].color);
        }
        /////////
        
        int array [][] = new int [3][3];
        int array2 [][] = {{0},{1,2},{3,4,5},{6,7,8,9},{8,7,6,5,4},{3,2,1,0,1,2},};
        for(int i = 0;i<array2.length;i++){
            for (int j = 0; j<array2[i].length;j++){
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
        

    }
    
}
