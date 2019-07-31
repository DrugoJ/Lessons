
import static com.sun.javafx.css.SizeUnits.PC;
import javax.swing.UIManager;
import com.jtattoo.plaf.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class Client {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
        view.setVisible(true);
    }
}
