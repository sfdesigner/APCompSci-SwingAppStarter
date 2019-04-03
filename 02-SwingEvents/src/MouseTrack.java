import javax.swing.*;
import java.awt.event.*;

public class MouseTrack {
    private JLabel xLoc;
    private JLabel yLoc;
    private JLabel action;
    private JPanel panel;

    int clickCount;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleForm");
        frame.setContentPane(new MouseTrack().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MouseTrack() {
        clickCount = 0;

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickCount++;
                action.setText("Click!");
                xLoc.setText(Integer.toString(e.getX()));
                yLoc.setText(Integer.toString(e.getY()));
                action.setText(Integer.toString(clickCount) + " clicks");
            }
        });
    }
}
