import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {



    private int xVelocity = 10;
    private int yVelocity = 10;

    private int xLocation = 100;
    private int yLocation = 100;

    private int diameter = 30;
    private int timePassed = 0; // 1/2 Seconds

    private Timer timer;
    private Color colorOval = Color.BLUE;
    private Image image;
    private boolean drawimage = false;




    MyPanel(){
        image = new ImageIcon("/Users/jamessmith/Desktop/smurfcat.png").getImage();
        this.setSize(HEIGHT, WIDTH);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        timer = new Timer(1000, this);
        timer.start();





    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;


        g2D.drawImage(image, xLocation, yLocation, null);
        drawimage = false;


        //g2D.setColor(colorOval);
        //g2D.fillOval(xLocation, yLocation, diameter, diameter);
        repaint();



    }

    public void paintImage(Graphics g){
        g.drawImage(image,xLocation, yLocation, null);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(timePassed);
        timePassed ++;

        //diameter = diameter + 1;

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        xLocation = e.getX()-15;
        yLocation = e.getY()-15;
        colorOval = Color.RED;

    }

    public void mouseReleased(MouseEvent e) {
        colorOval = Color.BLUE;

    }

    public void mouseEntered(MouseEvent e) {
        diameter = 30;


    }

    public void mouseExited(MouseEvent e) {
        diameter = 0;
        drawimage = true;
        xLocation = 100;
        yLocation = 100;


    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {
        xLocation = e.getX()-15;
        yLocation = e.getY()-15;




    }
}
