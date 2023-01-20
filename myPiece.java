/** This class will store a piece which is just an integer.
  * @author     Alejandro Alonso Piza
  * @id         alejandro.alonso@betheluniversity.edu
  * @course     CSIS 321:  Programming 3
  * @assignment Reversi Project
  * @related    none
 */
 
 public class myPiece extends Piece{
    public static final int WHITE = 1;
    public static final int BLACK = 2;
    public static final int BLANK = 0;
    
    public myPiece(int myType){
        super (myType);
    }
    
    public int getOpposite(int myType){
        if (myType == WHITE){
            return BLACK;
        }else if(myType == BLACK){
            return WHITE;
        }else{
            return -1;
        }
    }
 }