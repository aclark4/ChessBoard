/**Class for the Queen Piece
 * @author Adam Clark
 */
public class Queen extends MajorPiece {

    /** Creates a Queen piece, that extends the piece class
     * @param color The color of the piece
     */
    public Queen(byte color) {
        super(color);//Uses parent class piece to assign color value
    }

    /** Returns the value of the piece
     * @return the byte value of the piece, based off of color.
     */
    public byte getValue() {
        if(getColor() == 1) { //If else statement for color
            return 9;
        }
        else if(getColor() == 2) {
            return -9;
        }
        return 0;
    }

    /** Gets the letter for the piece
     * @return Q in string form
     */
    public String getLetter() {
        return "Q";
    }
    
}
