import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Boxlyt2 extends Frame{
    Button buttons[];
    Boxlyt2() {
        buttons = new Button[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("BUTTON" + (i + 1));
            add(buttons[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(100, 150);
        setVisible(true);
    }
    public static void main(String[] args){
        Boxlyt2 ob=new Boxlyt2();
    }
    }
