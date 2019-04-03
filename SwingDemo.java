import javax.swing.*;

public class SwingDemo {

    public SwingDemo() {

        // Create a new JFrame container
        JFrame frame = new JFrame("A Simple Swing Application");

        // Give the frame an initial size
        frame.setSize(275,100);

        // Terminate the program when the user closes the application.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label
        JLabel label = new JLabel(" GUI programming with Swing.");

        // Add the label to the content pane.
        frame.add(label);

        // Display the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create the grame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
