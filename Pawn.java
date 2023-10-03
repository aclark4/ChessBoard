/**Class for the Pawn Piece
 * @author Adam Clark
 */
public class Pawn extends MinorPiece{

    /** Creates a Pawn piece, that extends the piece class
     * @param color The color of the piece
     */
    public Pawn(byte color) {
        super(color); //This assigns color, using the parent class
    }

    /** Returns the value of the piece
     * @return the byte value of the piece, based off of color.
     */
    public byte getValue() {
        if(getColor() == 1) { //If statement determines the color
            return 1;
        }
        else if(getColor() == 2) {
            return -1;
        }
        return 0;
    }

    /** Gets the letter for the piece
     * @return "" in string form
     */
    public String getLetter() {
        return "";
    }
    
}
