import javax.swing.*;
/**
 * Created by 1 on 31.03.2019.
 */
public class MainWin extends JFrame {
    public MainWin(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(520,545);
        setLocation(400,400);
        add(new GameFi());
        setVisible(true);

    }
    public static void main(String[] args){
        MainWin mw = new MainWin();

    }
}
