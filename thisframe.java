import java.awt.*;
import java.awt.event.*;
class thisframe extends Frame
{
    public static void main(String args[])
    {

        thisframe f= new thisframe();
        f.setVisible(true);
        f.setSize(600,400);
        f.setTitle("Rishabhframe");
        f.addWindowListener(new thisclass());
    }
}
class thisclass extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
