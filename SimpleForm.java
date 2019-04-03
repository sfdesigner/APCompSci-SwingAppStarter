import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleForm {
    private JTextField entryField;
    private JButton convert;
    private JTextField outputField;
    private JPanel mainFrame;

    public SimpleForm() {
        convert.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String greeting = new String();
                greeting = "Hello, " + entryField.getText();
                outputField.setText(greeting);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleForm");
        frame.setContentPane(new SimpleForm().mainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


