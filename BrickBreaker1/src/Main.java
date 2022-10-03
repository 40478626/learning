import javax.swing.*;

public class Main{
    public static void main(String[] args){

        JFrame A = new JFrame();
        GameInterface game = new GameInterface();
        A.setBounds(10, 10, 1000, 600);
        A.setTitle("Brick Breaker");
        A.setResizable(false);
        A.setVisible(true);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\RA\\IdeaProjects\\BrickBreaker1\\src\\download.png");
         A.setIconImage(icon);*/
        A.add(game);

    }
}
