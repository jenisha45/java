package labreport.unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplySwing extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton ok, exit;

    MultiplySwing() {

        setLayout(new FlowLayout());

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        ok = new JButton("OK");
        exit = new JButton("Exit");

        add(new JLabel("Number 1:"));
        add(t1);

        add(new JLabel("Number 2:"));
        add(t2);

        add(new JLabel("Result:"));
        add(t3);

        add(ok);
        add(exit);

        ok.addActionListener(this);
        exit.addActionListener(this);

        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == ok) {

            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            int result = a * b;

            t3.setText(String.valueOf(result));
        }

        if(e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new MultiplySwing();
    }
}