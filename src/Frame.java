import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public MyPanel panel;
    Frame(){
        panel = new MyPanel();
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Application");
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setVisible(true);


    }



}
