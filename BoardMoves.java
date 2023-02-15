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
    public void makeMove(CheckerPiece piece, int row, int column){
        setPiece(piece, row, column);
    }
    
    //Helper
    //It checks to see if teh position where the piece wants to be put is empty or not
    //Then, it checks to see if the direction that it wants to go has the opposite piece
    public boolean isLegalMove(CheckerPiece piece, int row, int column, int dir){
        if(getPiece(row, column).getType() == Piece.BLANK){
            if(row-1 < 0 || row+1 > 7 || column-1 < 0 || column+1 > 7){
                return false;
            }
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
    
    //Checks to seee if the piece has a move or not
    public boolean hasMove(CheckerPiece piece){
        for(int row = 0; row < size; row++){
            for(int column = 0; column < size; column++){
                for (int i = 1; i <= size; i++){
                    if(isLegalMove(piece, row, column, i) == true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    //Sets who is playing, black or white
    public int setPlayer(int player){
        if(player == 1){
            return 2;
        }else if(player == 2){
            return 1;
        }
        return -1;
    }
    
    //Checks to see if the game is over or not
    public boolean gameOver(CheckerPiece player1, CheckerPiece player2){
        if(!hasMove(player1) && !hasMove(player2)){
            return true;  
        }
        return false;
    }
    
    //Gives the results of the game
    public String results(){
        int white = 0;
        int black = 0;
        String str = "";
        
        for(int row = 0; row < size; row++){
            for(int column = 0; column < size; column++){
                if(getPiece(row, column).getType() == CheckerPiece.WHITE){
                    white++;
                }else if(getPiece(row, column).getType() == CheckerPiece.BLACK){
                    black++;
                }
            }
        }
        str += "White: " + white + '\n';
        str += "Black: " + black + '\n';
        if(white > black){
            str += "White wins!";
        }else if(white < black){
            str += "Black wins!";
        }else{
            str += "It's a tie!";
        }
        return str;
    }
     
}
