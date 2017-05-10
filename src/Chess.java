import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Chess {
	boolean exitState = false;
	boolean turnIsWhite = true;
	char[][] chessArrayBeta = new char[8][8];
	ChessPiece[][] piecePositions = new ChessPiece[8][8];
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
	}
		
	public void createGame()
	{
		//String gameState = "RNBKQBNRPPPPPPPP                                pppppppprnbkqbnr";
		String gameState = "   KQBNRPPPb   P         Q     R            B PPpppppppprnbkqbnr";
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				switch (gameState.charAt((i*8)+j))
				{
				case 'p':
					this.piecePositions[i][j] = new Pawn(false);
					break;
				case 'r':
					this.piecePositions[i][j] = new Rook(false);
					break;
				case 'n':
					this.piecePositions[i][j] = new Knight(false);
					break;
				case 'b':
					this.piecePositions[i][j] = new Bishop(false);
					break;
				case 'q':
					this.piecePositions[i][j] = new Queen(false);
					break;
				case 'k':
					this.piecePositions[i][j] = new King(false);
					break;
					
				case 'P':
					this.piecePositions[i][j] = new Pawn(true);
					break;
				case 'R':
					this.piecePositions[i][j] = new Rook(true);
					break;
				case 'N':
					this.piecePositions[i][j] = new Knight(true);
					break;
				case 'B':
					this.piecePositions[i][j] = new Bishop(true);
					break;
				case 'Q':
					this.piecePositions[i][j] = new Queen(true);
					break;
				case 'K':
					this.piecePositions[i][j] = new King(true);
					break;
					
				default:
					this.piecePositions[i][j] = new ChessPiece();
					break;

			}
		}
		

		}
	return;
	}
	
	public void playGame()
	{
		while(!exitState)
		{
		chessBoardDisplay();
		movePiece();
		if(isTeamsKingInCheck(this.turnIsWhite))
				{
					if(this.turnIsWhite)
					{						
						System.out.println("--------------------\nWhite King is in Check!!!!!\n--------------------");
					}
					else
					{
						System.out.println("--------------------\nBlack King is in Check!!!!!\n--------------------");
					}
				}
		}
		sc.close();
	}
	
	public void chessBoardDisplay() {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				if (i == 0){
					switch (j){
					case 0:
						System.out.print(" ");
						break;
					case 1:
						System.out.print(" ");
						break;
					case 2:
						System.out.print("A ");
						break;
					case 3:
						System.out.print("B ");
						break;
					case 4:
						System.out.print("C ");
						break;
					case 5:
						System.out.print("D ");
						break;
					case 6:
						System.out.print("E ");
						break;
					case 7:
						System.out.print("F ");
						break;
					case 8:
						System.out.print("G ");
						break;
					case 9:
						System.out.print("H ");
						break;
					
					}
				}
				else
				{
					if(i == 1)
					{
						System.out.print("--");
					}
					else
					{
						if (j == 0){
							switch (i){
							case 2:
								System.out.print("1");
								break;
							case 3:
								System.out.print("2");
								break;
							case 4:
								System.out.print("3");
								break;
							case 5:
								System.out.print("4");
								break;
							case 6:
								System.out.print("5");
								break;
							case 7:
								System.out.print("6");
								break;
							case 8:
								System.out.print("7");
								break;
							case 9:
								System.out.print("8");
								break;
							
							}
						}
						else
							if (j==1)
							{
								System.out.print("|");
							}
							else
						{
						System.out.print(this.piecePositions[i-2][j-2].getDisplayCharacters() + " ");
						}
					}
				}
				
				
			}
			System.out.println();

			}
		System.out.println();
	}
		
	public boolean isTeamsKingInCheck(boolean isTeamWhite)
	{
		boolean isInCheck = false;
		
		boolean[][] isMoveValid = new boolean[8][8];
		int xCoordKing = -1;
		int yCoordKing = -1;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				if(!piecePositions[i][j].isEmptySpace() && piecePositions[i][j].isWhitePiece() != isTeamWhite)
				{
					isMoveValid = this.piecePositions[i][j].getValidMoves(j, i, this.piecePositions, isMoveValid);

					
				}
				
				if(piecePositions[i][j] instanceof King && piecePositions[i][j].isWhitePiece() == isTeamWhite)
				{
					xCoordKing = j;
					yCoordKing = i;
				}
				
			}
		}

		
		if (xCoordKing < 0 || yCoordKing < 0)
		{
			System.out.println("Did not find King");
		}
		else
		{
		if(isMoveValid[yCoordKing][xCoordKing])
				{
					isInCheck = true;
				}
		}
		return isInCheck;
	}

	public void movePiece() {
			
			if (turnIsWhite == true)
			{
				System.out.print("WHITE turn - ");
			}
			else
			{
				System.out.print("BLACK turn - ");
			}
			System.out.println("Select the grid position of the piece you would like to move or enter 'exit' to close: ");
			String square = sc.nextLine();
			String pattern = "^[A-H][1-8]$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(square);
			
			if(square.toLowerCase().equals("exit"))
			{
				this.exitState = true;
			}
			else if(!m.matches())
			{
				System.out.println("Not a valid position. Please enter a grid refernence between A1 - H8");
			}
			else
			{
				
					int xPosition = 0;
					String squareLetter = square.substring(0,1);
					
					switch (squareLetter){

					case "A": 
						xPosition = 0;
						break;
					case "B":
						xPosition = 1;
						break;
					case "C":
						xPosition = 2;
						break;
					case "D":
						xPosition = 3;
						break;
					case "E":
						xPosition = 4;
						break;
					case "F":
						xPosition = 5;
						break;
					case "G":
						xPosition = 6;
						break;
					case "H":
						xPosition = 7;
						break;				
					}
					
					String squareNumber = square.substring(1);				
					
					int yPosition = Integer.parseInt(squareNumber) - 1;
					//iPosition --;
					
					
					if (this.piecePositions[yPosition][xPosition].isEmptySpace())
					{
						System.out.println("You have not selected a piece, try again");
					}
					else if(this.piecePositions[yPosition][xPosition].isWhitePiece() != turnIsWhite)
					{
						if (turnIsWhite == true)
						{
							System.out.println("INVALID PIECE: Turn is White, please select a white (upper case) piece");
						}
						else
						{
							System.out.println("INVALID PIECE: Turn is Black, please select a black (lower case) piece");
						}
						
					}
					else
					{
					
					System.out.println("You have selected piece : " + this.piecePositions[yPosition][xPosition] + " and this piece has valid moves:");
					boolean[][] validMoves = new boolean[8][8];

					validMoves = this.piecePositions[yPosition][xPosition].getValidMoves(xPosition, yPosition, piecePositions);

					drawValidMoves(validMoves);
					System.out.println("Select the grid position you would like to move this piece to: ");
					square = sc.nextLine();
					m = r.matcher(square);
					if(!m.matches())
					{
						System.out.println("Not a valid position. Please enter a grid refernence between A1 - H8");
					}
					else
					{
							int xPosition2= 0;
							squareLetter = square.substring(0,1);
							
									
							switch (squareLetter){

							case "A": 
								xPosition2 = 0;
								break;
							case "B":
								xPosition2 = 1;
								break;
							case "C":
								xPosition2 = 2;
								break;
							case "D":
								xPosition2 = 3;
								break;
							case "E":
								xPosition2 = 4;
								break;
							case "F":
								xPosition2 = 5;
								break;
							case "G":
								xPosition2 = 6;
								break;
							case "H":
								xPosition2 = 7;
								break;				
							}
							
							squareNumber = square.substring(1);				
							
							int yPosition2 = Integer.parseInt(squareNumber) - 1;
							

							if (!isMoveValid(yPosition2, xPosition2, validMoves))
							{
								System.out.println("INVALID MOVE: Piece cannot move here");
							}
							else
							{

							
							ChessPiece takenPiece = new ChessPiece();
							takenPiece = this.piecePositions[yPosition2][xPosition2];
							this.piecePositions[yPosition2][xPosition2] = this.piecePositions[yPosition][xPosition];
							this.piecePositions[yPosition][xPosition] = new ChessPiece();
							boolean inCheck;
							inCheck = isTeamsKingInCheck(turnIsWhite);
							if(inCheck)
							{
								System.out.println("Invalid Move - This move leaves your King in Check!!!!");
								this.piecePositions[yPosition][xPosition] = this.piecePositions[yPosition2][xPosition2];
								this.piecePositions[yPosition2][xPosition2] = takenPiece;
							}
							else
							{
								if (turnIsWhite == true)
								{
									turnIsWhite = false;
								}
								else
								{
									turnIsWhite = true;
								}
							}
	
							
							}
					}
							

					}				
			}

			return;
		}
	
	public boolean isMoveValid(int iPosition, int jPosition, boolean[][] validMoves)
		{
			boolean isValid = false;
			if(validMoves[iPosition][jPosition] == true)
			{
				isValid = true;
			}
			return isValid;
		}
				
	public static void drawValidMoves(boolean[][] chessArray) {
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					
					if (i == 0){
						switch (j){
						case 0:
							System.out.print(" ");
							break;
						case 1:
							System.out.print(" ");
							break;
						case 2:
							System.out.print("A ");
							break;
						case 3:
							System.out.print("B ");
							break;
						case 4:
							System.out.print("C ");
							break;
						case 5:
							System.out.print("D ");
							break;
						case 6:
							System.out.print("E ");
							break;
						case 7:
							System.out.print("F ");
							break;
						case 8:
							System.out.print("G ");
							break;
						case 9:
							System.out.print("H ");
							break;
						
						}
					}
					else
					{
						if(i == 1)
						{
							System.out.print("--");
						}
						else
						{
							if (j == 0){
								switch (i){
								case 2:
									System.out.print("1");
									break;
								case 3:
									System.out.print("2");
									break;
								case 4:
									System.out.print("3");
									break;
								case 5:
									System.out.print("4");
									break;
								case 6:
									System.out.print("5");
									break;
								case 7:
									System.out.print("6");
									break;
								case 8:
									System.out.print("7");
									break;
								case 9:
									System.out.print("8");
									break;
								
								}
							}
							else
								if (j==1)
								{
									System.out.print("|");
								}
								else
							{
									if(chessArray[i-2][j-2] == true)
									{
										System.out.print("X ");
									}
									else
									{
										System.out.print(". ");
									}

							}
						}
					}
					
					
				}
				System.out.println();

				}
			System.out.println();
		}		
		
}
