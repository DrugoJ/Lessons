/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

/**
 *
 * @author GoD
 */
public class GetSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Person person = new Person();
        person.setAge(18);
        person.setName("Kirill");
        person.setSurName("Kuzmin");
        System.out.println(person.getCharacters());
        System.out.println(person.isMen());
    }
}
class Person{
    private String name;
    private String surName;
    private int age;
    private boolean men;
    private boolean woman;

    public String getCharacters(){
        return name+" "+surName+" "+age;
    }   

    
    public boolean isMen(){
        return true;
    }

    public boolean isWoman(){
        return true;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
