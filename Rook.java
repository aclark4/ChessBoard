/**Class for the Rook Piece
 * @author Adam Clark
 */
public class Rook extends MajorPiece {
    
    /** Creates a Rook piece, that extends the piece class
     * @param color The color of the piece
     */
    public Rook(byte color) {
        super(color);//Uses parent class piece to assign color value
    }

    /** Returns the value of the piece
     * @return the byte value of the piece, based off of color.
     */
    public byte getValue() {
        if(getColor() == 1) { //If else statement for color
            return 5;
        }
        else if(getColor() == 2) {
            return -5;
        }
        return 0;
    }

    /** Gets the letter for the piece
     * @return R in string form
     */
    public String getLetter() {
        return "R";
    }
    
}
