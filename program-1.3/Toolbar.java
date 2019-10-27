import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener { // creates a pane by automatically invoking constructor
                                                                // of JPanel - super();

    private static final long serialVersionUID = 1L;
    private JButton helloButton;
    private JButton goodbyeButton;
    private StringListener listener;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloButton.addActionListener(this); // adds a.c which is within this class
        goodbyeButton.addActionListener(this); // adds a.c which is within this class

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);
    }

    public void setStringListener(StringListener listener) { // assigner (namer) of nameless StringListener object
        this.listener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource(); // clicked checker
        if (clicked == helloButton) {
            listener.textEmitted("Hello!\n");
        } else {
            listener.textEmitted("Goodbye!\n");
        }
    }
}