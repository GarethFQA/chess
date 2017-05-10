
public class ChessPiece {
	boolean isEmptySpace;
	boolean isWhitePiece;
	String displayCharacters;
	
	public ChessPiece()
	{
	this.setEmptySpace(true);
	this.setWhitePiece(true);
	this.setDisplayCharacters(" ");
	}
	
	public boolean isEmptySpace() {
		return isEmptySpace;
	}

	public void setEmptySpace(boolean isEmptySpace) {
		this.isEmptySpace = isEmptySpace;
	}

	public boolean isWhitePiece() {
		return isWhitePiece;
	}

	public void setWhitePiece(boolean isWhitePiece) {
		this.isWhitePiece = isWhitePiece;
	}

	
	
	public String getDisplayCharacters() {
		return displayCharacters;
	}

	public void setDisplayCharacters(String displayCharacters) {
		this.displayCharacters = displayCharacters;
	}

	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions)
	{
		boolean[][] validMoves = new boolean[8][8];
		return validMoves;
	}
	
	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions, boolean[][] isMoveValid)
	{

		return isMoveValid;
	}



	

}
