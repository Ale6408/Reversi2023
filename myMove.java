/** This class will store a piece which is just an integer.
  * @author     Alejandro Alonso Piza
  * @id         alejandro.alonso@betheluniversity.edu
  * @course     CSIS 321:  Programming 3
  * @assignment Reversi Project
  * @related    none
 */
public class myMove extends Board{
    public makeMove(int row, int column, Piece inPiece){
        if(Piece[row][column] == LEGALMOVE){
            setPiece(row, column, inPiece);
        }else if(Piece[row][column] == BADMOVE){
            System.out.println("Illegal move");
        }else if(Piece[row][column] == ENDGAME){
            break;
        }
    }
}