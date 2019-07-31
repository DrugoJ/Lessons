/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatesasd
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author GoD
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view,model);
        view.setVisible(true);
    }
}