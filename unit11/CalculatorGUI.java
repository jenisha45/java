package javadatabaseconnection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton addBtn, subBtn;

    CalculatorGUI() {
        // Set frame properties
        setTitle("Simple Calculator");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel l1 = new JLabel("Enter First Number:");
        JLabel l2 = new JLabel("Enter Second Number:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");

        // Add components to frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(addBtn);
        add(subBtn);

        // Add action listeners
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());

            if (e.getSource() == addBtn) {
                double sum = num1 + num2;
                JOptionPane.showMessageDialog(this, "Sum = " + sum);
            } else if (e.getSource() == subBtn) {
                double diff = num1 - num2;
                JOptionPane.showMessageDialog(this, "Difference = " + diff);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
