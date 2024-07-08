package pieces;

import Main.Board;

import java.awt.image.BufferedImage;

public class Rook extends Piece {
    public Rook(Board board, int col, int row, boolean isWhite) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.name = "Rook";

        if (sheet != null) {
            int sheetScale = sheet.getWidth() / 6;
            this.sprite = sheet.getSubimage(4 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale).getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
        }
    }

    public boolean isValidMovement(int col, int row){
        return this.col == col || this.row == row;
    }
    public boolean moveCollidesWithPiece(int col, int row){


        //sol
        if(this.col > col)
        {
            for(int c = this.col -1;c > col;c--){
                if(board.getPiece(c, this.row) != null){
                    return true;
                }
            }
        }

        //sag
        if(this.col < col)
        {
            for(int c = this.col + 1;c < col;c++){
                if(board.getPiece(c, this.row) != null){
                    return true;
                }
            }
        }
        //yukarı
        if(this.row > row)
        {
            for(int r = this.row -1;r > row;r--){
                if(board.getPiece(this.col,r) != null){
                    return true;
                }
            }
        }

        //asagi
        if(this.row < col)
        {
            for(int r = this.row + 1;r < row;r++){
                if(board.getPiece(this.col, r) != null){
                    return true;
                }
            }
        }
        return false;
    }

}