package Assig1;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        GUI gui = new GUI(model);
        Controller controller = new Controller(model, gui);
        gui.frame.setVisible(true);

    }
}
