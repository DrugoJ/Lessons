/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BullsCows;

/**
 *
 * @author GoD
 */
public class BullsCows {
    public void runBC(){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
        view.setVisible(true);
    }
}
