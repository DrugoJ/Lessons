/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

/**
 *
 * @author GoD
 */
public class Test {
    private int i =5;
    protected int j = 6; //can be used in extends classes
    int k = 7;
    public int l = 8;
    public void method(){
        Test test = new Test();
        System.out.println(test.j+" - protected "+test.k+" - default "+test.l+" - public "+test.i+" - private"+"-----------main class");
        System.out.println(test.j+" - protected "+test.k+" - default "+test.l+" - public "+"--------all classes from this package");
    }
}

class TestModifiers {
    public void method(){
        Test test = new Test();
        System.out.println(test.j+" - protected "+test.k+" - default "+test.l+" - public "+"--------all classes from this package");
    }
}
