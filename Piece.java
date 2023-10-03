/**Parent abstract Class of Piece
 * @author Adam Clark
 */
public abstract class Piece {
    
     /**
     * color represents the color of the piece
     * location represents the location of the piece
     */
    private byte color;
    /** Creates a piece with a specific color
     * @param color represents the color of the piece
     */
    public Piece(byte color) {
        if(color == 1 || color == 2) { //If the color is 1 or 2, good
            this.color = color;
        }
        else { //Else, make the color 1 by default
            this.color = 1;
        }
    }
     /** Gets the color of the piece
     * @return A byte with the value of the color
     */
    public byte getColor() {
        return this.color;
    }
    /** Gets the location of the piece in string form
     * @return A string with the location of the piece as if plotted on a graph
     */
    public String getStringLocation() {
        String chars = "abcdefgh";
        Piece[][] checker = Board.getPieces(); //Call the getPieces method to get a 2d Array of the board
        for(int i = 0; i < checker.length; i++) { //Loop through elements to find current piece
            for(int j = 0; j < checker[i].length; j++) {
                if(this == checker[i][j]) {
                    return chars.charAt(i) + Integer.toString(j + 1);
                    //Sets the string with the col index through chars with i, and row through j.
                }
            }
        }
        return ""; //This will only run if there is no location found of that piece.
    }
    /** Gets the adjusted value of the piece
     * @return A double with the adjusted value of the piece
     */
    public double computeAdjustedValue() {
        double distanceX = 0;
        double distanceY = 0;
        Piece[][] checker = Board.getPieces();
        for(int i = 0; i < checker.length; i++) { //Loop through elements to find current piece
            for(int j = 0; j < checker[i].length; j++) {
                if(this == checker[i][j]) { //Finds location of the piece
                    distanceX = Math.abs(i - 3.5);
                    distanceY = Math.abs(j - 3.5);
                    
                }
            }
        }
        return this.getValue()*(5-distanceX)*(5-distanceY); //As required
    }
    /** Turns the piece into a string
     * @return the letter value of the piece plus the location
     */
    
    public String toString() {
        return getLetter() + getStringLocation(); //As required
    }
    /** Gets the value of the piece (individual to subclasses)
     * @return the byte of the value of the piece object called.
     */
    public abstract byte getValue();
    /** Gets a String to represent the type of piece.
     * @return the letter of the piece
     */
    public abstract String getLetter();
}
