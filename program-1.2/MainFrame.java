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

        toolbar.setTextPanel(this.textPanel);       // all classes must interact with each other only within MainFrame.
                                                    // this is called "MVC"

        add(toolbar,BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);

        setVisible(true);   // this statement must be at the very bottom of the entire code.
    }
}