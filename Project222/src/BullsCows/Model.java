/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BullsCows;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author GoD
 */
public class Model {
    public String getHint(String secret, String guess) {
    
    int countBull=0;
    int countCow=0;
 
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
    //check bull
    for(int i=0; i<secret.length(); i++){
        char c1 = secret.charAt(i);
        char c2 = guess.charAt(i);
 
        if(c1==c2){
            countBull++;
        }else{
            if(map.containsKey(c1)){
                int freq = map.get(c1);
                freq++;
                map.put(c1, freq);
            }else{
                map.put(c1, 1);
            }
        }
    }
 
    //check cow
    for(int i=0; i<secret.length(); i++){
        char c1 = secret.charAt(i);
        char c2 = guess.charAt(i);
 
        if(c1!=c2){
            if(map.containsKey(c2)){
                countCow++;
                if(map.get(c2)==1){
                    map.remove(c2);
                }else{
                    int freq = map.get(c2);
                    freq--;
                    map.put(c2, freq);
                }
            }
        } 
    }
    if(countBull==4){
     return "win";
    }
    else{
    return countBull+" Bulls "+countCow+" Cows";
    }
}
    public String getRnd(){
        Integer[] arr = new Integer[9];
            for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            }
            Collections.shuffle(Arrays.asList(arr));
            String str = arr[0]+""+arr[1]+""+arr[2]+""+arr[3]+"";
            return str;
    }
}
