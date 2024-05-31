import javax.swing.*;
import java.awt.*;

public class Button {
    JButton myButton;
    String buttonType;


    Button(JButton myButton, String buttonType) {
        this.myButton = myButton;
        this.buttonType = buttonType;

        this.myButton.setPreferredSize(new Dimension(100, 100));
        this.myButton.setFont(new Font("Arial", Font.BOLD, 35));
        this.myButton.setBackground(new Color(220, 140, 0));
        this.myButton.setForeground(new Color(222, 230, 236));
        this.myButton.setFocusable(false);

        if (this.buttonType.equals("Standard")) {
            this.myButton.setBackground(new Color(64, 64, 64));
        }
        if (this.myButton.getText().matches("C")) {
            this.myButton.setBackground(new Color(146, 1, 2));
        }

    }

}
