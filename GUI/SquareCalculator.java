
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SquareCalculator extends JFrame implements ActionListener {

    JLabel lblEnter, lblResult;
    JTextField txtNumber, txtSquare;
    JButton btnCalculate;

    public SquareCalculator() {
        // Frame title
        setTitle("Square Calculator");

        // Create components
        lblEnter = new JLabel("Enter any number:");
        lblResult = new JLabel("Square of entered number:");
        txtNumber = new JTextField(10);
        txtSquare = new JTextField(10);
        txtSquare.setEditable(false); // Output field shouldn't be editable
        btnCalculate = new JButton("Calculate Square");

        // Add action listener to button
        btnCalculate.addActionListener(this);

        // Layout setup
        setLayout(new GridLayout(3, 2, 10, 10));
        add(lblEnter);
        add(txtNumber);
        add(btnCalculate);
        add(new JLabel("")); // Empty cell for spacing
        add(lblResult);
        add(txtSquare);

        // Frame setup
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num = Double.parseDouble(txtNumber.getText());
            double square = num * num;
            txtSquare.setText(String.valueOf(square));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new SquareCalculator();
    }
}
