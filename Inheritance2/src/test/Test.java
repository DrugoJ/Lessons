/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
/**
 *
 * @author GoD
 */
public class Test {
    public static void main(String[]args){
        Child Kirill = new Child(); 
        Kirill.name = "Kirill";
        Kirill.Education = "School";
        Kirill.height = 184;
        Kirill.weight = 72;
        Kirill.characters();
        BadChild Mike = new BadChild();
        Mike.characters();
    }
}
class Person {
    String name;
    int weight;
    int height;
    public void characters(){
                System.out.println(name+" "+" "+height+" "+weight);
            }
}

class Child extends Person{
            String Education;
            @Override
            public void characters(){
                System.out.println(name+" "+Education+" "+height+" "+weight);
            }
        }  
class Adult extends Person{
            String work; 
            @Override
            public void characters(){
                System.out.println(name+" "+work+" "+height+" "+weight);
            }
        }
class BadChild extends Child{
            @Override
            public void characters(){
                Education = "is not";
                name = "Mike";
                weight = 70;
                height = 180;
                System.out.println(name+" "+ Education+" "+ height+" "+weight);
            }
        }

