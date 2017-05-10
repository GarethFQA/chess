
public class Knight extends ChessPiece{

	public Knight(boolean isPieceWhite){
		super();
		this.setEmptySpace(false);
		this.setWhitePiece(isPieceWhite);
		
		if(this.isWhitePiece())
		{
		this.setDisplayCharacters("N");
		}
		else
		{
		this.setDisplayCharacters("n");	
		}
		
	}
	
	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions)
	{
		boolean[][] isMoveValid = new boolean[8][8];
		if(xCoord + 2 <= 7)
		{
			if(yCoord + 1 <= 7 && (piecePositions[yCoord + 1][xCoord + 2].isEmptySpace() || piecePositions[yCoord + 1][xCoord + 2].isWhitePiece() != this.isWhitePiece()) )
				
			{
				isMoveValid[yCoord + 1][xCoord + 2] = true;						
			}
			
			if(yCoord -1 >= 0 && (piecePositions[yCoord - 1][xCoord + 2].isEmptySpace() || piecePositions[yCoord - 1][xCoord + 2].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord - 1][xCoord + 2] = true;
			}
		}
		
		if(xCoord - 2 >= 0)
		{
			if(yCoord + 1 <= 7 && (piecePositions[yCoord + 1][xCoord - 2].isEmptySpace() || piecePositions[yCoord + 1][xCoord - 2].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord + 1][xCoord - 2] = true;						
			}
			
			if(yCoord -1 >= 0 && (piecePositions[yCoord - 1][xCoord - 2].isEmptySpace() || piecePositions[yCoord - 1][xCoord - 2].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord - 1][xCoord - 2] = true;
			}
		}
		
		
		if(yCoord + 2 <= 7)
		{
			if(xCoord + 1 <= 7 && (piecePositions[yCoord + 2][xCoord + 1].isEmptySpace() || piecePositions[yCoord + 2][xCoord + 1].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord + 2][xCoord + 1] = true;						
			}
			
			if(xCoord -1 >= 0 && (piecePositions[yCoord + 2][xCoord - 1].isEmptySpace() || piecePositions[yCoord + 2][xCoord - 1].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord + 2][xCoord - 1] = true;
			}
		}
		
		if(yCoord - 2 >= 0)
		{
			if(xCoord + 1 <= 7 && (piecePositions[yCoord - 2][xCoord + 1].isEmptySpace() || piecePositions[yCoord - 2][xCoord + 1].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord - 2][xCoord + 1] = true;						
			}
			
			if(xCoord - 1 >= 0 && (piecePositions[yCoord - 2][xCoord - 1].isEmptySpace() || piecePositions[yCoord - 2][xCoord - 1].isWhitePiece() != this.isWhitePiece()) )
			{
				isMoveValid[yCoord - 2][xCoord - 1] = true;
			}
		}
		return isMoveValid;
	} 

	public boolean[][] getValidMoves(int xCoord, int yCoord, ChessPiece[][] piecePositions, boolean[][] isMoveValid)
	{
		if(xCoord + 2 <= 7)
		{
			if(yCoord + 1 <= 7 && (piecePositions[yCoord + 1][xCoord + 2].isEmptySpace() || piecePositions[yCoord + 1][xCoord + 2].isWhitePiece() != this.isWhitePiece()) )
				
			{
				isMoveValid[yCoord + 1][xCoord + 2] = true;		

			}
			
			if(yCoord -1 >= 0 && (piecePositions[yCoord - 1][xCoord + 2].isEmptySpace() || piecePositions[yCoord - 1][xCoord + 2].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord - 1][xCoord + 2] = true;

			}
		}
		
		if(xCoord - 2 >= 0)
		{
			if(yCoord + 1 <= 7 && (piecePositions[yCoord + 1][xCoord - 2].isEmptySpace() || piecePositions[yCoord + 1][xCoord - 2].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord + 1][xCoord - 2] = true;		

			}
			
			if(yCoord -1 >= 0 && (piecePositions[yCoord - 1][xCoord - 2].isEmptySpace() || piecePositions[yCoord - 1][xCoord - 2].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord - 1][xCoord - 2] = true;

			}
		}
		
		
		if(yCoord + 2 <= 7)
		{
			if(xCoord + 1 <= 7 && (piecePositions[yCoord + 2][xCoord + 1].isEmptySpace() || piecePositions[yCoord + 2][xCoord + 1].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord + 2][xCoord + 1] = true;	

			}
			
			if(xCoord -1 >= 0 && (piecePositions[yCoord + 2][xCoord - 1].isEmptySpace() || piecePositions[yCoord + 2][xCoord - 1].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord + 2][xCoord - 1] = true;

			}
		}
		
		if(yCoord - 2 >= 0)
		{
			if(xCoord + 1 <= 7 && (piecePositions[yCoord - 2][xCoord + 1].isEmptySpace() || piecePositions[yCoord - 2][xCoord + 1].isWhitePiece() != this.isWhitePiece()))
			{
				isMoveValid[yCoord - 2][xCoord + 1] = true;	

			}
			
			if(xCoord - 1 >= 0 && (piecePositions[yCoord - 2][xCoord - 1].isEmptySpace() || piecePositions[yCoord - 2][xCoord - 1].isWhitePiece() != this.isWhitePiece()) )
			{
				isMoveValid[yCoord - 2][xCoord - 1] = true;

			}
		}
		

		return isMoveValid;
	} 

}
