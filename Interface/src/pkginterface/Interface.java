/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author GoD
 */
public class Interface implements InterfaceExamp{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface inter = new Interface();
        //InterfaceExamp.PI = 1.22; - Запрещено менять константы
        inter.print("Kirill", "Kuzmin");
        System.out.println(InterfaceExamp.PI);
    }

    @Override
    public void print(String name, String surname) {
        System.out.println(name+" "+surname);
    }
    
}
