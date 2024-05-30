import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JLabel primaryDisplayLabel;
    JLabel secondaryDisplayLabel;
    String primaryDisplayText;
    String secondaryDisplayText;
    ButtonPanel buttonPanel;

    Calculator() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setSize(600, 700);
        this.getContentPane().setBackground(Color.black);

        buttonPanel = new ButtonPanel();
        this.add(buttonPanel);
        this.setVisible(true);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public void updateTextLabel() {

    }

    public void clearEntry() {

    }

    public void clear() {

    }

    public void equals() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
