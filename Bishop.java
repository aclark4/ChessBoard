/**Class for the Bishop Piece
 * @author Adam Clark
 */

public class Bishop extends MinorPiece {
    /** Creates a bishop of a certain color
     * @param color of the Bishop
     */
    public Bishop(byte color) {
        super(color);
    }
    /** Finds the value of a piece, depending on the color
     * @return the byte of a value of a piece
     */
    public byte getValue() {
        if(getColor() == 1) {
            return 3;
        }
        else if(getColor() == 2) {
            return -3;
        }
        return 0;
    }
    /** Gets the letter of the piece
     * @return the letter of the piece, in this case B for bishop
     */
    public String getLetter() {
        return "B";
    }
    
}
