import java.awt.*;
import java.awt.event.*;
public class Scribble1 extends Frame implements MouseListener,MouseMotionListener{
    public int last_x,last_y;
     Scribble1()
    {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e){
        last_x=e.getX();
        last_y=e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void mouseDragged(MouseEvent e){
        Graphics g =this.getGraphics();
        int x=e.getX(),y=e.getY();
        g.drawLine(last_x,last_y,x,y);
        last_x=x;last_y=y;
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String args[])
    {
        Scribble1 ch=new Scribble1();
        ch.setTitle("Scribble");
        ch.setSize(450,300);
        ch.setVisible(true);
    }

}
