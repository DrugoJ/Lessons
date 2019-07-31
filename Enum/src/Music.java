/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public enum Music {
    ROCK(5,"Rock"),POP(6,"Pop"),JAZZ(7,"Jazz");
    private int i;
    private String name;

    private Music(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i; 
    }

    public String getName() {
        return name;
    }
    public void foo(){
        System.out.println("it is - "+true);
    } 
    
}
