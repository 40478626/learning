import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Brick
{
    public int Brick[][];
    public int brickWidth;
    public int brickHeight;
    // brick with table
    public Brick (int row, int col)
    {
        Brick = new int[row][col];
        for(int a = 0; a<Brick.length; a++)
        {
            for(int b =0; b<Brick[0].length; b++)
            {
                Brick[a][b] = 1;
            }
        }

        brickWidth = 540/col;
        brickHeight = 150/row;
    }
    // create the bricks using 2D
    public void draw(Graphics2D g)
    {
        for(int a = 0; a<Brick.length; a++)
        {
            for(int b =0; b<Brick[0].length; b++)
            {
                if(Brick[a][b] > 0)
                {
                    g.setColor(Color.pink);
                    g.fillRect(b * brickWidth + 80, a * brickHeight + 50, brickWidth, brickHeight);

                    // this is just to show separate brick, game can still run without it
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.WHITE);
                    g.drawRect(b * brickWidth + 80, a * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col)
    {
        Brick[row][col] = value;
    }
}
