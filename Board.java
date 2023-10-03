/*
 * Name: Adam Clark
 * netID: aclark62
 * G#: G01392189
 * Lecture section: 004
 * Lab section: 207
 */

/**This is the class for the board
 * @author Adam Clark
 */
public class Board {
    /**
     * A 2d array of Piece that will act as the board (pieces)
     */
    private static Piece[][] pieces;
    /** Creates a Board with no inputs board to use, makes an 8x8 board
     */
    public Board(){
        pieces = new Piece[8][8]; //Sets the board to 8x8
    }
    /** Creates a board with an input 2d array of Piece
     * @param pieces is a 2d array of pieces to use as the board
     */
    public Board(Piece[][] pieces) {
        Board.pieces = pieces; //This uses the given 2d array as our Board class board
    }
    /**
     * Puts the piece in a requested locaiton
     * @param piece the piece that is to be put in the locaiton
     * @param x the x value of the grid to place the piece
     * @param y the y value of the grid to place the piece
     */
    public void setPiece(Piece piece, int x, int y) {
        pieces[x - 1][y - 1] = piece; //This will put the piece at the index given
    }
    /**
     * Returns the board as a 2d array
     * @return the board as a 2d array of Piece
     */
    public static Piece[][] getPieces() {
        return pieces; //Returns the 2d array of pieces
    }

    /**
     * Returns the whole boards total value of pieces
     * @return the value of pieces on the board
     */
    public double relativeEvaluation() {
        double sum = 0; //A double sum to add to in the loop to get the sum of values
        for(int i = 0; i < pieces.length; i++) {
            for(int j = 0; j < pieces[i].length; j++) {
                if(pieces[i][j] == null) { //If there is no piece there, move to the next spot
                    continue;
                }
                sum += pieces[i][j].getValue(); //for each piece, add the value of the piece to sum
            }

        }
        return sum; //return sum
    }

    /**
     * Gets the adjusted value of all pieces on the 2d array
     * @return the adjusted value of all the pieces on the board
     */
    public double adjustedEvaluation() {
        double sum = 0; //A double sum to add to in the loop to get the sum of values
        for(int i = 0; i < pieces.length; i++) {
            for(int j = 0; j < pieces[i].length; j++) {
                if(pieces[i][j] == null) { //If there is no piece at that location, move to the next one
                    continue;
                }
                sum += pieces[i][j].computeAdjustedValue(); //For each piece, add the adjusted value to the sum
            }

        }
        return sum; //return sum
    }

    /**
     * @return a string of all of the total pieces on the board, sorted by type of piece
     */
    public String toString() {
        int numKings = 0;
        int numPawns = 0;
        int numMajor = 0;
        int numMinor = 0;
        for(int i = 0; i < pieces.length; i++) { //Loop through the board, checking each spot for a piece
            for(int j = 0; j < pieces[i].length; j++) {
                if(pieces[i][j] == null) { //If there is no piece at that location, move to the next one
                    continue;
                }
                if(pieces[i][j].getLetter().equals("K")) {
                    numKings++;
                }
                else if(pieces[i][j].getLetter().equals("")) {
                    numPawns++;
                }
                else if(pieces[i][j].getLetter().equals("Q") || pieces[i][j].getLetter().equals("R")) {
                    numMajor++;
                }
                else if(pieces[i][j].getLetter().equals("N") || pieces[i][j].getLetter().equals("B")) {
                    numMinor++;
                }
            }

        }
        
        return "Board has:\n-King:" + numKings + "\n-Pawns:" + numPawns + "\n-MajorPieces:" + numMajor + "\n-MinorPieces:" + numMinor;
    }
}