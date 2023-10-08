import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StarterFrame extends JFrame implements MouseListener {

    static final int WIDTH = 500;
    static final int HEIGHT = 500;

    static final String welcomeMessage = "WELCOME!";
    JLabel welcome;




    StarterFrame() {

        welcome = new JLabel(welcomeMessage);

        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.setTitle("Application");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.addMouseListener(this);

    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
        this.setVisible(false);
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
