import java.awt.Component;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
class RadioButtons extends JFrame implements ActionListener{
    JRadioButton S,T,L;
    RadioButtons(){
        S=new JRadioButton("CSE");
        S.setBounds(400,50,100,30);
        T=new JRadioButton("English");
        T.setBounds(400,100,100,30);
        L=new JRadioButton("Electronics");
        L.setBounds(400,150,100,30);
        ButtonGroup Q=new ButtonGroup();
        Q.add(S);Q.add(T); Q.add(L);
        Component Component = add(S); 
                add(T);add(L);
        setSize(350,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    public static void main(String args[]){
        new RadioButtons();
    }
}
 
