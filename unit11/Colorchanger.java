package labreport.unit11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Colorchanger extends JFrame implements ActionListener {

    JButton b;

    Colorchanger() {

        b = new JButton("Change Color");
        add(b);

        setLayout(new FlowLayout());

        b.addActionListener(this);

        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        getContentPane().setBackground(Color.YELLOW);

    }

    public static void main(String args[]) {
        new Colorchanger();
    }
}  

