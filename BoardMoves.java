/*
  * @author     Alejandro Alonso Piza
  * @id         alejnadro.alonso@betheluniversity.edu
  * @course     CSIS 321:  Programming 3
  * @assignment Reversi Project
  * @related    Board
 */
public class BoardMoves extends Board{
    private CheckerPiece[][] pieces;
    private static final int UP = 1;
    private static final int DOWN = 2;
    private static final int RIGHT = 3;
    private static final int LEFT = 4;
    private static final int UPRIGHT = 5;
    private static final int UPLEFT = 6;
    private static final int DOWNRIGHT = 7;
    private static final int DOWNLEFT = 8;
    
    //Constructor
    //It buildst the board with the help of the class Board.java
    //It sets the pieces in the middle to start the game
    //It sets who the first player is (white)
    public BoardMoves(){
        new Board();
        CheckerPiece white = new CheckerPiece(1);
        CheckerPiece black = new CheckerPiece(2);
        
        setPiece(white, 3, 3);
        setPiece(black, 3, 4);
        setPiece(white, 4, 4);
        setPiece(black, 4, 3);
    }
    //Mutator
    //It puts a piece anywhere in the board (needs to be finished) 
    public void makeMove(Piece piece, int row, int column){
        setPiece(piece, row, column);
    }
    
    //Helper
    //It checks to see if teh position where the piece wants to be put is empty or not
    //Then, it checks to see if the direction that it wants to go has the opposite piece
    public boolean isLegalMove(CheckerPiece piece, int row, int column, int dir){
        if(getPiece(row, column).getType() == Piece.BLANK){
            switch(dir){
                case UP:
                    if(getPiece(row-1, column).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                case DOWN:
                    if(getPiece(row+1, column).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                case RIGHT:
                    if(getPiece(row, column+1).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                case LEFT:
                    if(getPiece(row, column-1).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                case UPRIGHT:
                    if(getPiece(row-1, column+1).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                case UPLEFT:
                    if(getPiece(row-1, column-1).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                case DOWNRIGHT:
                    if(getPiece(row+1, column+1).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                case DOWNLEFT:
                    if(getPiece(row+1, column-1).getType() == piece.getOpp(piece.getType())){
                        return true;
                    }
                }
            }
        return false;
    }
    
    public boolean hasMove(CheckerPiece piece){
        int i;
        for(int row = 0; row < size; row++){
            i = 0;
            for(int column = 0; column < size; column++){
                if(isLegalMove(piece, row, column, i) == true){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
    
    public int setPlayer(int player){
        if(player == 1){
            return 2;
        }else if(player == 2){
            return 1;
        }
        return -1;
    }
     
}