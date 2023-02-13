/*
  * @author     Alejandro Alonso Piza
  * @id         alejnadro.alonso@betheluniversity.edu
  * @course     CSIS 321:  Programming 3
  * @assignment Reversi Project
  * @related    Piece
 */
public class CheckerPiece extends Piece {
    public static final int WHITE = 1;
    public static final int BLACK = 2;
    
    //Constructor
    //Creates a piece of the indicated color (1=white, 2=black)
    public CheckerPiece(int color) {
        super(color);
    }
    
    //Mutator
    //Changes the type of the piece that you are checking
    public void setType(int myType){
        type = myType;
    }
    
    //Accessor
    //Gives you the opposite of the piece you are checking
    public int getOpp(int myType){
        if (myType == WHITE){
            return BLACK;
        }else if (myType == BLACK){
            return WHITE;
        }else{
            return -1;
        }
    }
    
    //Gives the character depending on teh type
    public char toChar() {
        if (type == WHITE){
            return 'w';
        }else if (type == BLACK){
            return 'b';
        }else{
            return '-';
        }
    }
}
