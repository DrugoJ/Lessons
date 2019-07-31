
import java.util.Arrays;
//http://follow-the-white-rabbit.online/klass-string-i-ego-metody/
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
        String str1 = new String("     Java is my favourite language     ");
        String str2 = "Hello";
        char [] mass = {1,2,3,4,5};
        //System.out.println(str1.charAt(0)); //return necessary char from String
        //System.out.println(str1.codePointAt(0)); //return necessary char from String (Unicode)
        //System.out.println(str1.compareTo(str2)); // Compare two strings
        //System.out.println(str1.compareToIgnoreCase(str2)); //Compare two strings, ignoring case
        //System.out.println(str1.concat(str2)); //join two Strings
        //System.out.println(str1.equals(str2)); //equal two Strings
        //System.out.println(str1.equalsIgnoreCase(str2)); //equal two Strings, ignoring case
        //System.out.println(str1.hashCode()); //return string's hashCode
        //System.out.println(str1.indexOf(97)); //reverse action of codePointAt
        //System.out.println(str1.isEmpty()); //if string is empty return boolean
        //System.out.println(str1.length()); //String's length
        /*String [] mass = str1.split(" "); //divide the String by the values in brackets
        for(String elements:mass){
            System.out.println(elements);
        }*/
        //System.out.println(str1.substring(0, 10));
        /*char [] array = str1.toCharArray(); //String to char array
        for(char elements:array){
            System.out.println(elements);
        }*/
        //System.out.println(str1.toUpperCase());
        //System.out.println(str1.toLowerCase());
        //System.out.println(str1.trim()); //Delete the empty space
        /*String hr = String.valueOf(27);//
        System.out.println(hr);*/
        //System.out.println(String.copyValueOf(mass));
    }
}
