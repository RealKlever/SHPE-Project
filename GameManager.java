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
        JLabel question;
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

        // Add OU Trivia title to window
        title.setFont(font);
        title.setVerticalAlignment(SwingConstants.TOP);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        window.add(title);

        JButton a = new JButton("Disable middle button");
        a.setVerticalTextPosition(AbstractButton.CENTER);
        a.setHorizontalTextPosition(AbstractButton.RIGHT); //aka LEFT, for left-to-right locales
        a.setActionCommand("disable");
        a.setSize(300, 150);
        window.getContentPane().add(a);

        JButton b = new JButton("Middle button");
        b.setVerticalTextPosition(AbstractButton.LEFT);
        b.setHorizontalTextPosition(AbstractButton.CENTER);
        b.setSize(300, 150);
        window.getContentPane().add(b);
        
        JButton c = new JButton("Enable middle button");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        c.setActionCommand("enable");
        c.setEnabled(false);

        JButton d = new JButton("Enable middle button");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        d.setActionCommand("enable");
        d.setEnabled(false);
    }
}