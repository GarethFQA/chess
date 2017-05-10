
public class Bishop extends ChessPiece{

	public Bishop(boolean isPieceWhite){
		super();
		this.setEmptySpace(false);
		this.setWhitePiece(isPieceWhite);
		
		if(this.isWhitePiece())
		{
		this.setDisplayCharacters("B");
		}
		else
		{
		this.setDisplayCharacters("b");	
		}
		
	}
	
	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions)
	{
		boolean[][] isMoveValid = new boolean[8][8];
		

		int i = 1;
		boolean isFoeA = false;
		boolean isFoeB = false;
		while (xCoord + i <= 7)
		{
			if(yCoord - i >= 0)
			{
				if(piecePositions[yCoord - i][xCoord + i].isEmptySpace() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord + i] = true;
				}
				else if(piecePositions[yCoord - i][xCoord + i].isWhitePiece() != this.isWhitePiece() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord + i] = true;
					isFoeA = true;
				}
				else
				{
					isFoeA = true;
				}
				
				
			}
			if(yCoord + i <= 7)
			{
				if(piecePositions[yCoord + i][xCoord + i].isEmptySpace() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord + i] = true;
				}
				else if(piecePositions[yCoord + i][xCoord + i].isWhitePiece() != this.isWhitePiece() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord + i] = true;
					isFoeB = true;
				}
				else
				{
					isFoeB = true;
				}
				
				
			}
			
			i++;
		}
		
		i = 1;
		isFoeA = false;
		isFoeB = false;
		while (xCoord - i >= 0)
		{
			if(yCoord - i >= 0)
			{
				if(piecePositions[yCoord - i][xCoord - i].isEmptySpace() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord - i] = true;
				}
				else if(piecePositions[yCoord - i][xCoord - i].isWhitePiece() != this.isWhitePiece() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord - i] = true;
					isFoeA = true;
				}
				else
				{
					isFoeA = true;
				}
				
				
			}
			if(yCoord + i <= 7)
			{
				if(piecePositions[yCoord + i][xCoord - i].isEmptySpace() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord - i] = true;
				}
				else if(piecePositions[yCoord + i][xCoord - i].isWhitePiece() != this.isWhitePiece() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord - i] = true;
					isFoeB = true;
				}
				else
				{
					isFoeB = true;
				}
				
				
			}
			
			i++;
		}
		
		return isMoveValid;
	} 

	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions, boolean[][] isMoveValid)
	{
		

		int i = 1;
		boolean isFoeA = false;
		boolean isFoeB = false;
		while (xCoord + i <= 7)
		{
			if(yCoord - i >= 0)
			{
				if(piecePositions[yCoord - i][xCoord + i].isEmptySpace() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord + i] = true;

				}
				else if(piecePositions[yCoord - i][xCoord + i].isWhitePiece() != this.isWhitePiece() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord + i] = true;

					isFoeA = true;
				}
				else
				{
					isFoeA = true;
				}
				
				
			}
			if(yCoord + i <= 7)
			{
				if(piecePositions[yCoord + i][xCoord + i].isEmptySpace() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord + i] = true;

				}
				else if(piecePositions[yCoord + i][xCoord + i].isWhitePiece() != this.isWhitePiece() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord + i] = true;

					isFoeB = true;
				}
				else
				{
					isFoeB = true;
				}
				
				
			}
			
			i++;
		}
		
		i = 1;
		isFoeA = false;
		isFoeB = false;
		while (xCoord - i >= 0)
		{
			if(yCoord - i >= 0)
			{
				if(piecePositions[yCoord - i][xCoord - i].isEmptySpace() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord - i] = true;

				}
				else if(piecePositions[yCoord - i][xCoord - i].isWhitePiece() != this.isWhitePiece() && !isFoeA)
				{
					isMoveValid[yCoord - i][xCoord - i] = true;

					isFoeA = true;
				}
				else
				{
					isFoeA = true;
				}
				
				
			}
			if(yCoord + i <= 7)
			{
				if(piecePositions[yCoord + i][xCoord - i].isEmptySpace() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord - i] = true;

				}
				else if(piecePositions[yCoord + i][xCoord - i].isWhitePiece() != this.isWhitePiece() && !isFoeB)
				{
					isMoveValid[yCoord + i][xCoord - i] = true;

					isFoeB = true;
				}
				else
				{
					isFoeB = true;
				}
				
				
			}
			
			i++;
		}
		

		return isMoveValid;
	} 

}