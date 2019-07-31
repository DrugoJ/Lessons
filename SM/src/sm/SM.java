/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm;

/**
 *
 * @author GoD
 */
  public class SM {
    public String checkIt(String s) {
        if (s.length() == 0 || s == null) {
            return "EMPTY";
        } else
            return "NOT EMPTY";
    }
    
    public static void main(String[] args) {
        SM a = new SM();
        a.checkIt(null);
    }
}


