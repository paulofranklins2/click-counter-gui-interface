import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private ClickButton clickButton;
    private ScreenSize screenSize;

    GUI() {
        this.add(prepareScreen());
        this.add(clickButton.clickButton());
        this.add(clickButton.labelCounter());
    }

    public JPanel prepareScreen() {
        this.screenSize = new ScreenSize();
        this.clickButton = new ClickButton();
        this.setTitle("Click Counter");
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setFocusable(true);
        this.setPreferredSize(new Dimension(screenSize.getWidth(), screenSize.getHeight()));
        this.getContentPane().setLayout(null);
        this.pack();
        return new JPanel();
    }

}
