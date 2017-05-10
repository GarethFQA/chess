
public class Pawn extends ChessPiece{

	public Pawn(boolean isPieceWhite){
		super();
		this.setEmptySpace(false);
		this.setWhitePiece(isPieceWhite);
		
		if(this.isWhitePiece())
		{
		this.setDisplayCharacters("P");
		}
		else
		{
		this.setDisplayCharacters("o");	
		}
	}
	
	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions)
	{
		boolean[][] isMoveValid = new boolean[8][8];
		
		if(this.isWhitePiece())
		{
			if (piecePositions[yCoord + 1][xCoord].isEmptySpace())
			{

				if (yCoord == 1 && piecePositions[yCoord + 2][xCoord].isEmptySpace())
				{
					isMoveValid[yCoord + 2][xCoord] = true;
				}
				isMoveValid[yCoord + 1][xCoord] = true;
			}
			if (xCoord > 0)
			{
				if(!piecePositions[yCoord + 1][xCoord -1].isEmptySpace() && piecePositions[yCoord + 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
						{
							isMoveValid[yCoord + 1][xCoord - 1] = true;
						}
			}
			if (xCoord < 7)
			{
				if(!piecePositions[yCoord + 1][xCoord + 1].isEmptySpace() && piecePositions[yCoord + 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord + 1][xCoord + 1] = true;
				}
			}
		}
		
		
		else
			
			
		{
			if (piecePositions[yCoord - 1][xCoord].isEmptySpace())
			{

				if (yCoord == 6 && piecePositions[yCoord - 2][xCoord].isEmptySpace())
				{
					isMoveValid[yCoord - 2][xCoord] = true;
				}
				isMoveValid[yCoord - 1][xCoord] = true;
			}
			if (xCoord > 0)
			{
				if(!piecePositions[yCoord - 1][xCoord -1].isEmptySpace() && piecePositions[yCoord - 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
						{
							isMoveValid[yCoord - 1][xCoord - 1] = true;
						}
			}
			if (xCoord < 7)
			{
				if(!piecePositions[yCoord - 1][xCoord + 1].isEmptySpace() && piecePositions[yCoord - 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord - 1][xCoord + 1] = true;
				}
			}
			
		}
		return isMoveValid;
	} 

	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions, boolean[][] isMoveValid)
	{
		
		if(this.isWhitePiece())
		{
			if (piecePositions[yCoord + 1][xCoord].isEmptySpace())
			{

				if (yCoord == 1 && piecePositions[yCoord + 2][xCoord].isEmptySpace())
				{
					isMoveValid[yCoord + 2][xCoord] = true;

				}
				isMoveValid[yCoord + 1][xCoord] = true;
			}
			if (xCoord > 0)
			{
				if(!piecePositions[yCoord + 1][xCoord -1].isEmptySpace() && piecePositions[yCoord + 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
						{
							isMoveValid[yCoord + 1][xCoord - 1] = true;

						}
			}
			if (xCoord < 7)
			{
				if(!piecePositions[yCoord + 1][xCoord + 1].isEmptySpace() && piecePositions[yCoord + 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord + 1][xCoord + 1] = true;

				}
			}
		}
		
		
		else
			
			
		{
			if (piecePositions[yCoord - 1][xCoord].isEmptySpace())
			{

				if (yCoord == 6 && piecePositions[yCoord - 2][xCoord].isEmptySpace())
				{
					isMoveValid[yCoord - 2][xCoord] = true;

				}
				isMoveValid[yCoord - 1][xCoord] = true;

			}
			if (xCoord > 0)
			{
				if(!piecePositions[yCoord - 1][xCoord -1].isEmptySpace() && piecePositions[yCoord - 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
						{
							isMoveValid[yCoord - 1][xCoord - 1] = true;

						}
			}
			if (xCoord < 7)
			{
				if(!piecePositions[yCoord - 1][xCoord + 1].isEmptySpace() && piecePositions[yCoord - 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord - 1][xCoord + 1] = true;

				}
			}
			
		}

		return isMoveValid;
	} 

}
