import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {


    ButtonPanel buttonPanel;
    TextPanel textPanel;

    Calculator() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setSize(470, 700);
        this.getContentPane().setBackground(Color.black);

        textPanel = new TextPanel();
        buttonPanel = new ButtonPanel();

        this.add(textPanel);
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

}
