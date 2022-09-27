import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickButton extends JPanel implements ActionListener {
    private int counter;
    private JButton jButton;
    private JLabel jLabel;
    private ScreenSize screenSize;
    private int width = 200;
    private int height = 50;

    public JButton clickButton() {
        this.jButton = new JButton();
        this.screenSize = new ScreenSize();

        jButton.setText("Click Me");
        jButton.setBounds(
                screenSize.getWidth() / 2 - (this.width / 2),
                screenSize.getHeight() / 2 - this.height,
                width,
                height);
        jButton.addActionListener(this::actionPerformed);
        this.add(jButton);
        return jButton;
    }

    public JLabel labelCounter() {
        this.jLabel = new JLabel();
        this.screenSize = new ScreenSize();
        jLabel.setBounds(
                screenSize.getWidth() / 2 - (this.width / 2),
                screenSize.getHeight() / 2 - this.height + 40,
                200,
                50);
        jLabel.setText("Number of Clicks: 0");
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(jLabel);
        return jLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        jLabel.setText("Number of Clicks: " + counter);
    }
}
