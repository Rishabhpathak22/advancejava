import java.awt.*;
import java.awt.event.*;
public class rishiButton {
    public static void main(String[] args) {
        Frame f = new Frame("Button's Example");
        final TextField ff = new TextField();
        ff.setBounds(50, 60, 120, 50);
        Button b = new Button("Click  on Button");
        b.setBounds(40, 150, 60, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ff.setText("My Name Is Rishabh pathak.");
            }
        });
        f.add(b);
        f.add(ff);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new close());
    }

    static class close extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
