import javax.swing.*;
import java.awt.*;

public class GameManager extends JFrame{
    public static void main(String[] args){
        new GameManager();
    }
    
    public GameManager(){
        // Adding Java UI elements
        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        JLabel title = new JLabel("<html><font color='red'>OU</font> Trivia</html>");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        Font font = new Font("Arial", Font.BOLD, 150);

        Color cream = new Color(255, 253, 208);

        // Set window title, visiblity, and size
        window.setTitle("OU Trivia");
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setSize(screenSize.width, screenSize.height);
        pack();

        // Set background color
        window.getContentPane().setBackground(cream);

        title.setFont(font);
        title.setVerticalAlignment(SwingConstants.TOP);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        window.add(title);
    }
}