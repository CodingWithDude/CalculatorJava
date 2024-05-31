import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {


    TextPanel textPanel;
    ButtonPanel buttonPanel;
    String entry;
    Double currentDouble;
    Double nextDouble;
    String currentOperand;

    JButton clearButton;
    JButton clearEntryButton;
    JButton moduloButton;
    JButton divisionButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton multiplicationButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton subtractionButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton additionButton;
    JButton zeroButton;
    JButton decimalButton;
    JButton equalsButton;

    Calculator() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setSize(470, 700);
        this.getContentPane().setBackground(Color.black);

        textPanel = new TextPanel();
        buttonPanel = new ButtonPanel();

        setupButtons();
        setupButtonActionListeners();


        this.add(textPanel);
        this.add(buttonPanel);
        this.setVisible(true);
    }

    private void setupButtons() {
        clearButton = buttonPanel.clearButton.myButton;
        clearEntryButton = buttonPanel.clearEntryButton.myButton;
        moduloButton = buttonPanel.moduloButton.myButton;
        divisionButton = buttonPanel.divisionButton.myButton;
        sevenButton = buttonPanel.sevenButton.myButton;
        eightButton = buttonPanel.eightButton.myButton;
        nineButton = buttonPanel.nineButton.myButton;
        multiplicationButton = buttonPanel.multiplicationButton.myButton;
        fourButton = buttonPanel.fourButton.myButton;
        fiveButton = buttonPanel.fiveButton.myButton;
        sixButton = buttonPanel.sixButton.myButton;
        subtractionButton = buttonPanel.subtractionButton.myButton;
        oneButton = buttonPanel.oneButton.myButton;
        twoButton = buttonPanel.twoButton.myButton;
        threeButton = buttonPanel.threeButton.myButton;
        additionButton = buttonPanel.additionButton.myButton;
        zeroButton = buttonPanel.zeroButton.myButton;
        decimalButton = buttonPanel.decimalButton.myButton;
        equalsButton = buttonPanel.equalsButton.myButton;
    }

    private void setupButtonActionListeners() {
        clearButton.addActionListener(this);
        clearEntryButton.addActionListener(this);
        moduloButton.addActionListener(this);
        divisionButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        multiplicationButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        subtractionButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        additionButton.addActionListener(this);
        zeroButton.addActionListener(this);
        decimalButton.addActionListener(this);
        equalsButton.addActionListener(this);
    }

    public double add(double currentDouble, double nextDouble) {
        return nextDouble + currentDouble;
    }

    public double subtract(double currentDouble, double nextDouble) {
        return nextDouble - currentDouble;
    }

    public double multiply(double currentDouble, double nextDouble) {
        return nextDouble * currentDouble;
    }

    public double divide(double currentDouble, double nextDouble) {
        return nextDouble / currentDouble;
    }

    public double modulo(double currentDouble, double nextDouble) {
        return nextDouble % currentDouble;
    }

    public void updateTextLabel() {
        System.out.println("updateTextLabel");
        textPanel.setPrimaryDisplayLabel("test2");
    }

    public void clearEntry() {
        System.out.println("clearEntry");
    }

    public void clear() {
        System.out.println("clear");
    }

    public void equals() {
        System.out.println("equals");
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "C":
                System.out.println("C");
                clear();
                break;
            case "CE":
                System.out.println("CE");
                clearEntry();
                break;
            case "%":
                System.out.println("%");
                break;
            case "÷":
                System.out.println("÷");
                break;
            case "7":
                entry += e.getActionCommand();
                System.out.println("7");
                break;
            case "8":
                System.out.println("8");
                break;
            case "9":
                System.out.println("9");
                break;
            case "×":
                System.out.println("×");
                break;
            case "4":
                System.out.println("4");
                break;
            case "5":
                System.out.println("5");
                break;
            case "6":
                System.out.println("6");
                break;
            case "-":
                System.out.println("-");
                break;
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "+":
                System.out.println("+");
                break;
            case "0":
                System.out.println("0");
                break;
            case ".":
                System.out.println(".");
                break;
            case "=":
                System.out.println("=");
                equals();
                break;
        }

    }
}
