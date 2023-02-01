public class CheckerPiece extends Piece {
    public static final int WHITE = 1;
    public static final int BLACK = 2
    
    public CheckerPiece(int inType, int inColor) {
        super(inType);
    }
    
    public void setType(int myType){
        type = myType;
    }
    
    public getOpp(){
        if (inType == WHITE){
            return BLACK
        }else if (inType == BLACK){
            return WHITE
        }
    }
    
    public char toChar() {
        if (type == WIHTE){
            return 'w';
        }else if (type == BLACK){
            return 'b';
        }else{
            return 'blank';
        }
    }
}
