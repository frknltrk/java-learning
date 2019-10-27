import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private JButton button;
    private TextArea textArea;

    MainFrame() {
        setDefaultCloseOperation(3);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        button = new JButton("Click Me!");
        textArea = new TextArea();
        add(button, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.appendText("You've just clicked.\n");
            }
        });

        setVisible(true);
    }

}