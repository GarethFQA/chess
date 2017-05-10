
public class King extends ChessPiece{

	public King(boolean isPieceWhite){
		super();
		this.setEmptySpace(false);
		this.setWhitePiece(isPieceWhite);
		
		if(this.isWhitePiece())
		{
		this.setDisplayCharacters("K");
		}
		else
		{
		this.setDisplayCharacters("k");	
		}
	}
	
	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions)
	{
		boolean[][] isMoveValid = new boolean[8][8];
		


		if(yCoord - 1 >= 0)
		{
			if(xCoord - 1 >= 0)
			{
				if(piecePositions[yCoord - 1][xCoord - 1].isEmptySpace() || piecePositions[yCoord - 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord - 1][xCoord - 1] = true;
					
				}
			}
			if(piecePositions[yCoord - 1][xCoord].isEmptySpace() || piecePositions[yCoord - 1][xCoord].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord - 1][xCoord] = true;
			}
			if(xCoord + 1 <= 7)
			{
				if(piecePositions[yCoord - 1][xCoord + 1].isEmptySpace() || piecePositions[yCoord - 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord - 1][xCoord + 1] = true;
				}
			}
			
			
		}
		
		if(xCoord - 1 >= 0)
		{
			if(piecePositions[yCoord][xCoord - 1].isEmptySpace() || piecePositions[yCoord][xCoord - 1].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord][xCoord - 1] = true;
			}
		}

		if(xCoord + 1 <= 7)
		{
			if(piecePositions[yCoord][xCoord + 1].isEmptySpace() || piecePositions[yCoord][xCoord + 1].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord][xCoord + 1] = true;
			}
		}
		
		
		if(yCoord + 1 <= 7)
		{
			if(xCoord - 1 >= 0)
			{
				if(piecePositions[yCoord + 1][xCoord - 1].isEmptySpace() || piecePositions[yCoord + 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord + 1][xCoord - 1] = true;
				}
			}
			if(piecePositions[yCoord + 1][xCoord - 1].isEmptySpace() || piecePositions[yCoord + 1][xCoord].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord + 1][xCoord] = true;
			}
			if(xCoord + 1 <= 7)
			{
				if(piecePositions[yCoord + 1][xCoord + 1].isEmptySpace() || piecePositions[yCoord + 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord + 1][xCoord + 1] = true;
				}
			}
		}
		
		
		
		return isMoveValid;
	} 

	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions, boolean[][] isMoveValid)
	{
		
		if(yCoord - 1 >= 0)
		{
			if(xCoord - 1 >= 0)
			{
				if(piecePositions[yCoord - 1][xCoord - 1].isEmptySpace() || piecePositions[yCoord - 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord - 1][xCoord - 1] = true;

				}
			}
			if(piecePositions[yCoord - 1][xCoord].isEmptySpace() || piecePositions[yCoord - 1][xCoord].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord - 1][xCoord] = true;

			}
			if(xCoord + 1 <= 7)
			{
				if(piecePositions[yCoord - 1][xCoord + 1].isEmptySpace() || piecePositions[yCoord - 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord - 1][xCoord + 1] = true;

				}
			}
			
			
		}
		
		if(xCoord - 1 >= 0)
		{
			if(piecePositions[yCoord][xCoord - 1].isEmptySpace() || piecePositions[yCoord][xCoord - 1].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord][xCoord - 1] = true;

			}
		}

		if(xCoord + 1 <= 7)
		{
			if(piecePositions[yCoord][xCoord + 1].isEmptySpace() || piecePositions[yCoord][xCoord + 1].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord][xCoord + 1] = true;

			}
		}
		
		
		if(yCoord + 1 <= 7)
		{
			if(xCoord - 1 >= 0)
			{
				if(piecePositions[yCoord + 1][xCoord - 1].isEmptySpace() || piecePositions[yCoord + 1][xCoord - 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord + 1][xCoord - 1] = true;

				}
			}
			if(piecePositions[yCoord + 1][xCoord - 1].isEmptySpace() || piecePositions[yCoord + 1][xCoord].isWhitePiece() != this.isWhitePiece())
			{
				isMoveValid[yCoord + 1][xCoord] = true;

			}
			if(xCoord + 1 <= 7)
			{
				if(piecePositions[yCoord + 1][xCoord + 1].isEmptySpace() || piecePositions[yCoord + 1][xCoord + 1].isWhitePiece() != this.isWhitePiece())
				{
					isMoveValid[yCoord + 1][xCoord + 1] = true;

				}
			}
		}
		
		

		return isMoveValid;

	} 

}