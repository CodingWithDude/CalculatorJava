import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    Button clearButton;
    Button clearEntryButton;
    Button moduloButton;
    Button divisionButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;
    Button multiplicationButton;
    Button fourButton;
    Button fiveButton;
    Button sixButton;
    Button subtractionButton;
    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button additionButton;
    Button zeroButton;
    Button decimalButton;
    Button equalsButton;

    Button[] allButtonArray;

    ButtonPanel() {

        this.setLayout(new GridLayout(5, 4));
        this.setBounds(10, 155, 450, 500);
        this.setVisible(true);

        clearButton = new Button(new JButton("C"), "C");
        clearEntryButton = new Button(new JButton("CE"), "Standard");
        moduloButton = new Button(new JButton("%"), "Standard");
        divisionButton = new Button(new JButton("÷"), "Operand");
        sevenButton = new Button(new JButton("7"), "Standard");
        eightButton = new Button(new JButton("8"), "Standard");
        nineButton = new Button(new JButton("9"), "Standard");
        multiplicationButton = new Button(new JButton("×"), "Operand");
        fourButton = new Button(new JButton("4"), "Standard");
        fiveButton = new Button(new JButton("5"), "Standard");
        sixButton = new Button(new JButton("6"), "Standard");
        subtractionButton = new Button(new JButton("-"), "Operand");
        oneButton = new Button(new JButton("1"), "Standard");
        twoButton = new Button(new JButton("2"), "Standard");
        threeButton = new Button(new JButton("3"), "Standard");
        additionButton = new Button(new JButton("+"), "Operand");
        zeroButton = new Button(new JButton("0"), "Standard");
        decimalButton = new Button(new JButton("."), "Standard");
        equalsButton = new Button(new JButton("="), "Standard");

        this.add(clearButton.myButton);
        this.add(clearEntryButton.myButton);
        this.add(moduloButton.myButton);
        this.add(divisionButton.myButton);
        this.add(sevenButton.myButton);
        this.add(eightButton.myButton);
        this.add(nineButton.myButton);
        this.add(multiplicationButton.myButton);
        this.add(fourButton.myButton);
        this.add(fiveButton.myButton);
        this.add(sixButton.myButton);
        this.add(subtractionButton.myButton);
        this.add(oneButton.myButton);
        this.add(twoButton.myButton);
        this.add(threeButton.myButton);
        this.add(additionButton.myButton);
        this.add(zeroButton.myButton);
        this.add(decimalButton.myButton);
        this.add(equalsButton.myButton);

    }

}
