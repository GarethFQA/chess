
public class Queen extends ChessPiece{

	public Queen(boolean isPieceWhite){
		super();
		this.setEmptySpace(false);
		this.setWhitePiece(isPieceWhite);
		
		if(this.isWhitePiece())
		{
		this.setDisplayCharacters("Q");
		}
		else
		{
		this.setDisplayCharacters("q");	
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
		
		//check right
				i = 1;
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
		
		//check right
				i = 1;
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
