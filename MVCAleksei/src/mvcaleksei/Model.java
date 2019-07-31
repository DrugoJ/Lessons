/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcaleksei;

/**
 *
 * @author GoD
 */
public class Model { 
public String main(int s){ 
    String ss = ""; 
    while(s!=1){ 
        if (s%2==0){ 
            s = s/2; 
            ss = ss+s+" - "; 
        } 
        else{ 
            s = (3*s+1)/2; 
            ss = ss+s+" - "; 
        } 
        } 
    return ss; 
    } 
}