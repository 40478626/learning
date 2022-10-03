
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameInterface extends JPanel implements KeyListener, ActionListener {
        // to show the score
        private boolean play = false;
        private int score = 0;

        // total bricks do we got
        private int totalBricks = 21;

        // speed of the ball
        private Timer speed;
        private int delay = 8;

        // starting position  of player
        private int playerX = 310;

        // starting position and direction of ball
        private int ballpositionX = 120;
        private int ballpositionY = 350;
        private int balldirectionX = -1;
        private int balldirectionY = -2;


    public GameInterface() {
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
       /* speed =  new Timer(delay, this);
        speed.start();*/
        }

        // for front view of slider n ball
        public void draw (Graphics V){
            //background
            Color color = new Color(201, 144, 252);
            V.setColor(Color.getColor(String.valueOf(color)));
            V.fillRect(1, 1, 692, 592);

            //border
            V.setColor(Color.MAGENTA);
            V.fillRect(0, 0, 3, 592);
            V.fillRect(0, 0, 692, 3);
            V.fillRect(692, 0, 3, 592);

            //paddle
            V.setColor(Color.CYAN);
            V.fillRect(playerX, 550, 100, 8);

            //ball
            V.setColor(Color.WHITE);
            V.fillRect(ballpositionX, ballpositionY, 20, 20);
        }

        @Override
        public void actionPerformed (ActionEvent e){

        }

        @Override
        public void keyPressed (KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                if (playerX >= 600) {
                    playerX = 600;
                } else {
                    moveRight();
                }
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
                if (playerX < 10) {
                    playerX = 10;
                } else {
                    moveLeft();
                }

        }
        @Override
        public void keyTyped (KeyEvent e){

        }

        @Override
        public void keyReleased (KeyEvent e){

        }
        public void moveRight () {
            play = true;
            playerX += 2;

        }
        public void moveLeft () {
            play = true;
            playerX -= 2;

        }
}
