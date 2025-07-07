
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class ExamForm extends JFrame {

    private final JTextField nameField;
    private final JTextField rollField;
    private final JCheckBox termsCheck;
    private final JButton submitBtn;

    public ExamForm() {
        super("Exam Registration");

        // 1. Create form components
        nameField = new JTextField(20);
        rollField = new JTextField(20);
        termsCheck = new JCheckBox("I accept the Terms and Conditions");
        submitBtn = new JButton("Submit");

        // 2. Lay out components
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(5, 5, 5, 5);
        gc.anchor = GridBagConstraints.WEST;

        // Row 1: Name
        gc.gridx = 0;
        gc.gridy = 0;
        form.add(new JLabel("Name:"), gc);
        gc.gridx = 1;
        form.add(nameField, gc);

        // Row 2: Roll Number
        gc.gridx = 0;
        gc.gridy = 1;
        form.add(new JLabel("Roll Number:"), gc);
        gc.gridx = 1;
        form.add(rollField, gc);

        // Row 3: Terms checkbox
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        form.add(termsCheck, gc);

        // Row 4: Submit button
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.CENTER;
        form.add(submitBtn, gc);

        // 3. Wire up the button action
        submitBtn.addActionListener(e -> onSubmit());

        // 4. Final window settings
        this.setContentPane(form);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // center on screen
    }

    private void onSubmit() {
        String name = nameField.getText().trim();
        String roll = rollField.getText().trim();

        if (!termsCheck.isSelected()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please accept the Terms and Conditions first.",
                    "Terms Not Accepted",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        if (name.isEmpty() || roll.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please fill in all fields.",
                    "Incomplete Data",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Append the data to exam.txt
        try (FileWriter fw = new FileWriter("exam.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println("Name: " + name + ", Roll: " + roll);
            JOptionPane.showMessageDialog(
                    this,
                    "Information saved successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );
            // Optionally, clear the form:
            nameField.setText("");
            rollField.setText("");
            termsCheck.setSelected(false);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error writing to file: " + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        // Launch on the EDT
        SwingUtilities.invokeLater(() -> {
            new ExamForm().setVisible(true);
        });
    }
}
