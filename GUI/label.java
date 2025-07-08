
import javax.swing.*;

class label extends JFrame {

    static JFrame f;
    static JLabel l;

    public static void main(String[] args) {
        f = new JFrame("label example");
        l = new JLabel("enter your name:");

        JPanel p = new JPanel();
        p.add(l);
        f.add(p);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField t = new JTextField(10);
        p.add(t);
        f.setVisible(true);
      

    }
}
