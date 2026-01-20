package NewIDEAS;

import java.awt.*; // Imports all AWT classes

public class SimpleAWTExample {
    public static void main(String[] args) {
        // Create a Frame (window)
        Frame f = new Frame("My AWT Example");

        // Create a Button
        Button b = new Button("Click Me");

        // Set position of button using FlowLayout (also from java.awt)
        b.setBounds(50, 100, 80, 30);

        // Add button to frame
        f.add(b);

        // Set frame size and layout
        f.setSize(400, 400);
        f.setLayout(null);

        // Make the frame visible
        f.setVisible(true);
    }
}
