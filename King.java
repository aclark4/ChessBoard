/**Class for the King Piece
 * @author Adam Clark
 */
public class King extends MajorPiece {
    /** Creates a king piece, that extends the piece class
     * @param color The color of the piece
     */
    public King(byte color) {
        super(color);
    }

    /** Returns the value of the piece
     * @return the byte value of the piece, based off of color.
     */
    public byte getValue() {
        if(getColor() == 1) { //If statement determines color
            return 9;
        }
        else if(getColor() == 2) {
            return -9;
        }
        return 0; //This would only happen if the color is not 1 or 2, meaning something is wrong anyways.
    }

    /** Returns the letter value of the piece type
     * @return the letter K as a string
     */
    public String getLetter() {
        return "K";
    }
    
}
