import java.awt.*;
import javax.swing.*;

public class MyMenuEx extends JFrame
{
    JMenuBar mu;
    JMenu file,edit,font;
    JMenuItem op,save,c1,cp,pr,f1,f2;
    JCheckBoxMenuItem pp;
    MyMenuEx()
    {
        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        mu=new JMenuBar();
        c.add(mu,BorderLayout.NORTH);
        file=new JMenu("File");
        edit=new JMenu("Edit");
        mu.add(file);
        mu.add(edit);
        op=new JMenuItem("OPEN");
        save=new JMenuItem("SAVE");
        c1=new JMenuItem("CLOSE");
        cp=new JMenuItem("COPY");
        pr=new JMenuItem("PASTE");

        file.add(op);
        file.add(save);
        file.add(c1);
        edit.add(cp);
        edit.add(pr);
        pp=new JCheckBoxMenuItem("PRINT");
        file.add(pp);
        file.addSeparator();
        font=new JMenu("Font");
        file.add(font);

        f1=new JMenuItem("F1");
        f2=new JMenuItem("F2");
        font.add(f1);
        font.add(f2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        MyMenuEx ob=new MyMenuEx();
        ob.setTitle("Menu's Example");
        ob.setSize(600,400);
        ob.setVisible(true);
    }
}
