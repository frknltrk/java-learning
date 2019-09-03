import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private static final long serialVersionUID = 1L;
    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame(){
        super("My App");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        setLayout(new BorderLayout());

        textPanel=new TextPanel();
        toolbar=new Toolbar();
// --------------------------------------------------------------------------------------------------------------------------
        toolbar.setStringListener(new StringListener(){     // forwards from "new";
                                                            // baby has just born ("creation" including "definition")
                                                            // an anonymous (nameless) StringListener object.
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });
        
// "a new StringListener interface object - with an imitated appendText method (textEmitted) in it";
// has been created [1]
// and sent off to Toolbar [2]
// ---------------------------------------------------------------------------------------------------------------------------
        add(toolbar,BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);

        setVisible(true);   // this statement must be at the very bottom of the entire code.
    }
}
