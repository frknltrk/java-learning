import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel { // creates a pane by automatically invoking constructor of JPanel - super();

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;

    public TextPanel() {

        textArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER); // adds "text-area with scoll-bar"
                                                             // on the center of the pane
    }

    public void appendText(String text) {
        textArea.append(text);
    }
}