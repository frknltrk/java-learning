import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener { // creates a pane by automatically invoking constructor
                                                                // of JPanel - super();

    private static final long serialVersionUID = 1L;
    private JButton helloButton;
    private JButton goodbyeButton;
    private TextPanel textPanel;                    // reprensenter (instance)

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);        // adds a.c which is within this class
        goodbyeButton.addActionListener(this);      // adds a.c which is within this class

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;                 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked=(JButton)e.getSource();         // clicked checker
        if(clicked==helloButton){
            textPanel.appendText("Hello!\n");
        }
        else{
            textPanel.appendText("Goodbye\n");
        }
    }
}