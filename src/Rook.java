
public class Rook extends ChessPiece{
	
	public Rook(boolean isPieceWhite){
		super();
		this.setEmptySpace(false);
		this.setWhitePiece(isPieceWhite);
		
		if(this.isWhitePiece())
		{
		this.setDisplayCharacters("R");
		}
		else
		{
		this.setDisplayCharacters("r");	
		}
		
	}
	
	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions)
	{
		boolean[][] isMoveValid = new boolean[8][8];
		
		//check right
		int i = 1;
		while (xCoord + i <= 7 && piecePositions[yCoord][xCoord + i].isEmptySpace())
		{
			isMoveValid[yCoord][xCoord + i] = true;
			i++;
		}
		if (xCoord + i <= 7 && piecePositions[yCoord][xCoord + i].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord][xCoord + i] = true;
		}
		//check down
		i = 1;
		while (yCoord + i <= 7 && piecePositions[yCoord + i][xCoord].isEmptySpace())
		{
			isMoveValid[yCoord + i][xCoord] = true;
			System.out.print("Test " + i + " yCoord = " + yCoord + " ~ ");
			i++;
		}
		if (yCoord + i <= 7 && piecePositions[yCoord + i][xCoord].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord + i][xCoord] = true;
		}
		
		//check left
		i = 1;
		while (xCoord - i >= 0 && piecePositions[yCoord][xCoord - i].isEmptySpace())
		{
			isMoveValid[yCoord][xCoord - i] = true;
			i++;
		}
		if (xCoord - i >= 0 && piecePositions[yCoord][xCoord - i].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord][xCoord - i] = true;
		}
		
		//check up
		i = 1;
		while (yCoord - i >= 0 && piecePositions[yCoord - i][xCoord].isEmptySpace())
		{
			isMoveValid[yCoord - i][xCoord] = true;
			i++;
		}
		if (yCoord - i >= 0 && piecePositions[yCoord - i][xCoord].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord - i][xCoord] = true;
		}
		return isMoveValid;
	} 

	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions, boolean[][] isMoveValid)
	{
		
		//check right
		int i = 1;
		while (xCoord + i <= 7 && piecePositions[yCoord][xCoord + i].isEmptySpace())
		{
			isMoveValid[yCoord][xCoord + i] = true;

			i++;
		}
		if (xCoord + i <= 7 && piecePositions[yCoord][xCoord + i].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord][xCoord + i] = true;

		}
		//check down
		i = 1;
		while (yCoord + i <= 7 && piecePositions[yCoord + i][xCoord].isEmptySpace())
		{
			isMoveValid[yCoord + i][xCoord] = true;

			i++;
		}
		if (yCoord + i <= 7 && piecePositions[yCoord + i][xCoord].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord + i][xCoord] = true;

		}
		
		//check left
		i = 1;
		while (xCoord - i >= 0 && piecePositions[yCoord][xCoord - i].isEmptySpace())
		{
			isMoveValid[yCoord][xCoord - i] = true;

			i++;
		}
		if (xCoord - i >= 0 && piecePositions[yCoord][xCoord - i].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord][xCoord - i] = true;
	
		}
		
		//check up
		i = 1;
		while (yCoord - i >= 0 && piecePositions[yCoord - i][xCoord].isEmptySpace())
		{
			isMoveValid[yCoord - i][xCoord] = true;
	
			i++;
		}
		if (yCoord - i >= 0 && piecePositions[yCoord - i][xCoord].isWhitePiece() != this.isWhitePiece())
		{
			isMoveValid[yCoord - i][xCoord] = true;

		}
		

		return isMoveValid;
	}
}
