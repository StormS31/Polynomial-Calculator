package Assig1;
import Assig1.Controller.Controller;
import Assig1.GUI.GUI;
import Assig1.Model.Model;
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        GUI gui = new GUI(model);
        Controller controller = new Controller(model, gui);
        gui.frame.setVisible(true);

    }
}
