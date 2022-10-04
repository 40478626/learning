import java.util.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import javax.swing.Timer;

public class GameInterface extends JPanel implements KeyListener, ActionListener {
    // to show the score
    private boolean play = false;
    private int score = 0;

    // total bricks do we got
    private int totalBricks = 21;

    // starting position  of player
    private int paddleX = 310;

    // starting position and direction of ball
    private int ballpositionX = 120;

    private int ballpositionY = 350;
    private int balldirX = -1;
    private int balldirY = -2;
    // speed of the ball
    private Timer speed;
    private int delay=10;

    private Brick brick;

    public GameInterface()
    {
        brick = new Brick(3, 7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        speed=new Timer(delay,this);
        speed.start();
    }

    // for front view of slider n ball
    public void paint(Graphics V)
    {
        // background
        Color color = new Color(201, 144, 252);
        V.setColor(Color.getColor(String.valueOf(color)));
        V.fillRect(1, 1, 692, 592);

        // drawing brick
        brick.draw((Graphics2D) V);

        // borders
        V.setColor(Color.magenta);
        V.fillRect(0, 0, 4, 600);
        V.fillRect(0, 0, 700, 4);


        // the scores
        V.setColor(Color.white);
        V.setFont(new Font("Serif",Font.ITALIC, 27));
        V.drawString(""+score, 590,30);

        // the paddle
        V.setColor(Color.WHITE);
        V.fillRect(paddleX, 550, 100, 6);

        // the ball
        V.setColor(Color.MAGENTA);
        // circle
        V.fillOval(ballpositionX, ballpositionY, 18, 18);

        // Victory
        if(totalBricks <= 0)
        {
            play = false;
            balldirX = 0;
            balldirY = 0;
            V.setColor(Color.CYAN);
            V.setFont(new Font("Monospace",Font.ITALIC, 35));
            V.drawString("Congratulation! You Totally Brake it!", 260,300);

            V.setColor(Color.CYAN);
            V.setFont(new Font("Monospace",Font.ITALIC, 30));
            V.drawString("Let's Break it again,Champion! (Enter)", 230,350);
        }

        // Defeat
        if(ballpositionY > 540)
        {
            play = false;
            balldirX = 0;
            balldirY = 0;
            V.setColor(Color.red);
            V.setFont(new Font("Monospace",Font.ITALIC, 35));
            V.drawString("Defeat! Scores: "+score, 190,300);

            V.setColor(Color.red);
            V.setFont(new Font("Monospace",Font.ITALIC, 20));
            V.drawString("Let's try and break it again! (Enter)", 190,350);
        }

        V.dispose();
    }
    // KeyListen
    public void keyPressed(KeyEvent e)
    {
        // for right
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            if(paddleX >= 600)
            {
                paddleX = 600;
            }
            else
            {
                moveRight();
            }
        }
        // for left
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            if(paddleX < 10)
            {
                paddleX = 10;
            }
            else
            {
                moveLeft();
            }
        }
        // for enter
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(!play)
            {
                play = true;
                ballpositionX = 120;
                ballpositionY = 350;
                balldirX = -1;
                balldirY = -2;
                paddleX = 310;
                score = 0;
                totalBricks = 30;
                brick = new Brick(3,7);

                repaint();
            }
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public void moveRight()
    {
        play = true;
        paddleX+=20;
    }

    public void moveLeft()
    {
        play = true;
        paddleX-=20;
    }

    //ball and paddle performance
    public void actionPerformed(ActionEvent e)
    {
        speed.start();
        if(play)
        {
            // bounce
            if(new Rectangle(ballpositionX, ballpositionY, 20, 20).intersects(new Rectangle(paddleX, 550, 30, 8)))
            {
                balldirY = -balldirY;
                balldirX = -2;
            }
            else if(new Rectangle(ballpositionX, ballpositionY, 20, 20).intersects(new Rectangle(paddleX + 70, 550, 30, 8)))
            {
                balldirY = -balldirY;
                balldirX = balldirX + 1;
            }
            else if(new Rectangle(ballpositionX, ballpositionY, 20, 20).intersects(new Rectangle(paddleX + 30, 550, 40, 8)))
            {
                balldirY = -balldirY;
            }

            // check brick collision with the ball
            A: for(int a = 0; a<brick.Brick.length; a++)
            {
                for(int b =0; b<brick.Brick[0].length; b++)
                {
                    if(brick.Brick[a][b] > 0)
                    {
                        //scores++;
                        int brickX = b * brick.brickWidth + 80;
                        int brickY = a * brick.brickHeight + 50;
                        int brickWidth = brick.brickWidth;
                        int brickHeight = brick.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballpositionX, ballpositionY, 20, 20);
                        Rectangle brickRect = rect;

                        if(ballRect.intersects(brickRect))
                        {
                            brick.setBrickValue(0, a, b);
                            score+=5;
                            totalBricks--;

                            // when ball hit right or left of brick
                            if(ballpositionX + 19 <= brickRect.x || ballpositionX + 1 >= brickRect.x + brickRect.width)
                            {
                                balldirX = -balldirX;
                            }
                            // when ball hits top or bottom of brick
                            else
                            {
                                balldirY = -balldirY;
                            }

                            break A;
                        }
                    }
                }
            }

            ballpositionX += balldirX;
            ballpositionY += balldirY;

            if(ballpositionX < 0)
            {
                balldirX = -balldirX;
            }
            if(ballpositionY < 0)
            {
                balldirY = -balldirY;
            }
            if(ballpositionX > 670)
            {
                balldirX = -balldirX;
            }

            repaint();
        }
    }
}
