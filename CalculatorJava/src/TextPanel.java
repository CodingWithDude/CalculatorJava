import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    JLabel primaryDisplayLabel;
    JLabel secondaryDisplayLabel;
    String primaryDisplayText;
    String secondaryDisplayText;

    TextPanel() {
        primaryDisplayLabel = new JLabel("test", JLabel.RIGHT);
        secondaryDisplayLabel = new JLabel("test", JLabel.RIGHT);

        primaryDisplayLabel.setBounds(0, 5, 450, 50);
        primaryDisplayLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        primaryDisplayLabel.setForeground(new Color(222, 230, 236));

        secondaryDisplayLabel.setBounds(0, 25, 450, 150);
        secondaryDisplayLabel.setFont(new Font("Arial", Font.PLAIN, 70));
        secondaryDisplayLabel.setForeground(new Color(222, 230, 236));

        this.add(primaryDisplayLabel);
        this.add(secondaryDisplayLabel);
        this.setBounds(0, 0, 500, 135);
        this.setBackground(Color.black);
        this.setLayout(null);


    }

}
