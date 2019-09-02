import javax.swing.SwingUtilities;
public class App{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){      // runs the program in a special thread
                                                        // (for multithread-ed apps)
            @Override
            public void run() {
                new MainFrame();

            }
        });
    }
}