/**Class for the Knight Piece
 * @author Adam Clark
 */
public class Knight extends MinorPiece {

    /** Creates a Knight piece
     * @param color the color of the piece as a byte value
     */
    public Knight(byte color) {
        super(color);//Uses parent class piece to assign color value
    }

    /** Gets the value of the piece based off of color
     * @return the value of the piece in byte form, based on color
     */
    public byte getValue() {
        if(getColor() == 1) { //If statement determines color
            return 3;
        }
        else if(getColor() == 2) {
            return -3;
        }
        return 0;
    }

    /** Gets the letter for the piece
     * @return the letter N in string form
     */
    public String getLetter() {
        return "N";
    }
    
}
