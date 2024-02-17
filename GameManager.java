import javax.swing.*;
import java.awt.*;

public class GameManager extends JFrame{
    public static void main(String[] args){
        new GameManager();
    }
    
    public GameManager(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        Color crimson = new Color(153, 0, 0);

        // Set window title, visiblity, and size
        frame.setTitle("OU Trivia");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(screenSize.width, screenSize.height);
        pack();

        // Set background color
        frame.getContentPane().setBackground(crimson);
    }
}