import javax.swing.*;
import java.awt.*;

public class GameManager extends JFrame{
    public static void main(String[] args){
        new GameManager();
    }
    
    public GameManager(){
        JFrame frame = new JFrame();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        // Set window title and visiblity
        frame.setTitle("OU Trivia");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(screenSize.width, screenSize.height);
        pack();
    }
}