/**Class for the Minor Pieces to be extended upon
 * @author Adam Clark
 */
public abstract class MinorPiece extends Piece {

    /** Creates a Minor piece, that extends the piece class
     * @param color The color of the piece
     */
    public MinorPiece(byte color) {
        super(color); //Uses the Piece constructor to set the color byte
    }
}
