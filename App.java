import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int screenWidth = 750;
        int screenHeight = 250;

        JFrame frame = new JFrame("Google Chrome Dinosaur");
        frame.setSize(screenWidth, screenHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChromeDinosaur chromeDinosaur = new ChromeDinosaur();
        frame.add(chromeDinosaur);
        frame.pack();
        chromeDinosaur.requestFocus();
        frame.setVisible(true);
    }
}
