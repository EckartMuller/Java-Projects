package pieces;

import Main.Board;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;

public class Piece {

    public int col, row;
    public int xPos, yPos;//taşın konumu için public iki veri olusturduk

    public boolean isWhite;
    public String name;//bu taşın ismi olacak
    public int value;//bu taşın değerini temsil edecek yani mesela şah 5se piyon 1 gibi

    public boolean isFirstMove= true;

    BufferedImage sheet;
    Image sprite;
    Board board;

    public Piece(Board board){
        this.board = board;
        try {
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("pieces.png"));//resmimizi bufferedimage nesnesine yükledik
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  boolean isValidMovement(int col, int row){
        return true;
    }public  boolean moveCollidesWithPiece(int col, int row){
        return false;
    }

    public void paint(Graphics2D g2d) {
        if (sprite != null) {
            g2d.drawImage(sprite, xPos, yPos, null);
        }
    }
}