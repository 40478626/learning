import java.awt.*;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame A=new JFrame();
        GameInterface game = new GameInterface();

        A.setBounds(10, 10, 700, 600);
        A.setTitle("Break It!");
        A.setResizable(false);
        A.setVisible(true);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        A.add(game);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\RA\\IdeaProjects\\BrickBreaker\\src\\logo.png");
        A.setIconImage(icon);
        A.setVisible(true);

    }

}
