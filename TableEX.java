import javax.swing.*;
public class  TableEX{

    JFrame f;

    TableEX() {
        f = new JFrame();
        String data [] []={
            {
                "1000", "A", "English"
            },
            {
                "1001", "B", "HINDI"
            },
            {
                "1002", "A", "SCIENCE"
            },
            {
                "1003", "C", "SOCIAL SCIENCE"
            }
        } ;
        String column[] = {"Roll no.", "GRADE", "Course"};
        JTable st = new JTable(data, column);
        st.setBounds(40, 20, 40, 20);
        JScrollPane ss = new JScrollPane(st);
        f.add(ss);
        f.setSize(200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TableEX();
    }
}
