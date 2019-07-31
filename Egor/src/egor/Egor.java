/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egor;

/**
 *
 * @author GoD
 */
public class Egor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        NewJFrame view = new NewJFrame();
        Controller controller = new Controller(view,model);
        view.setVisible(true);
        
    }
    
}
