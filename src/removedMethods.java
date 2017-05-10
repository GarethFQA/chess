public class removedMethods {
/*
FROM CHESS.JAVA

 	public static char[][] chessStringToArray(String gameState) {
		int position = 0;
		char[][] chessArray = new char[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessArray[i][j] = gameState.charAt(position);
				position++;
			}
		}
		
		return chessArray;
		
	}
	
	public static void chessBoard(char[][] chessArray) {
	
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
						System.out.print(chessArray[i-2][j-2] + " ");
						}
					}
				}
				
				
			}
			System.out.println();

			}
		System.out.println();
	}
	
	
		public void startGame()
	{
		String gameState = "RNBKQBNRPPPPPPPP                                pppppppprnbkqbnr";
		//String gameState = "   K BNR   B   p         Q                      pppppppprnbkqbnr";
		
		chessArrayBeta = chessStringToArray(gameState);
		
		while(!exitState)
		{
		chessBoard(chessArrayBeta);
		chessArrayBeta = move(chessArrayBeta);
		}
	return;
	}

 public char[][] move(char[][] chessArray) {
		Scanner sc = new Scanner(System.in);
		if (turnIsWhite == true)
		{
			System.out.println("WHITE turn");
		}
		else
		{
			System.out.println("BLACK turn");
		}
		System.out.println("Select the grid position of the piece you would like to move or enter 'exit' to close: ");
		String square = sc.nextLine();
		
		
		if(square.toLowerCase().equals("exit"))
		{
			this.exitState = true;
		}
		else
		{
			
			//check if " ", if true break else statement


				int jPosition = 0;
				String squareLetter = square.substring(0,1);
				
				switch (squareLetter){

				case "A": 
					jPosition = 0;
					break;
				case "B":
					jPosition = 1;
					break;
				case "C":
					jPosition = 2;
					break;
				case "D":
					jPosition = 3;
					break;
				case "E":
					jPosition = 4;
					break;
				case "F":
					jPosition = 5;
					break;
				case "G":
					jPosition = 6;
					break;
				case "H":
					jPosition = 7;
					break;				
				}
				
				String squareNumber = square.substring(1);				
				
				int iPosition = Integer.parseInt(squareNumber) - 1;
				//iPosition --;
				
				
				if (chessArray[iPosition][jPosition] == (char) ' ')
				{
					System.out.println("You have not selected a piece, try again");
				}
				else if(checkIfPieceWhite(chessArray[iPosition][jPosition]) != turnIsWhite)
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
					
				System.out.println("You have selected piece : " + chessArray[iPosition][jPosition] + " and this piece has valid moves:");
				boolean[][] validMoves = new boolean[8][8];
				if (turnIsWhite == true)
				{
					validMoves = checkValidMovesWhite(iPosition, jPosition, chessArray[iPosition][jPosition]);
				}
				else
				{
					validMoves = checkValidMovesBlack(iPosition, jPosition, chessArray[iPosition][jPosition]);
				}
				drawValidMoves(validMoves);
				System.out.println("Select the grid position you would like to move this piece to: ");
				square = sc.nextLine();
				
						
						int jPosition2= 0;
						squareLetter = square.substring(0,1);
						
								
						switch (squareLetter){

						case "A": 
							jPosition2 = 0;
							break;
						case "B":
							jPosition2 = 1;
							break;
						case "C":
							jPosition2 = 2;
							break;
						case "D":
							jPosition2 = 3;
							break;
						case "E":
							jPosition2 = 4;
							break;
						case "F":
							jPosition2 = 5;
							break;
						case "G":
							jPosition2 = 6;
							break;
						case "H":
							jPosition2 = 7;
							break;				
						}
						
						squareNumber = square.substring(1);				
						
						int iPosition2 = Integer.parseInt(squareNumber) - 1;
						

						if (!isMoveValid(iPosition2, jPosition2, validMoves) && turnIsWhite)
						{
							System.out.println("INVALID MOVE: Piece cannot move here");
						}
						else
						{

						

						chessArray[iPosition2][jPosition2] = chessArray[iPosition][jPosition];
						chessArray[iPosition][jPosition] = (char) ' ';
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
						
						return chessArray;
						
		}
		return chessArray;
	}
	
			public boolean[][] checkValidMovesWhite(int iPosition, int jPosition, char piece)
		{
			boolean isMoveValid[][] = new boolean[8][8];
			int i = 1;
			boolean isFoeA = false;
			boolean isFoeB = false;
			switch (piece)
			{
			case 'R':
				
					i = 1;
					while (jPosition + i <= 7 && chessArrayBeta[iPosition][jPosition + i] == (char) ' ')
					{
						isMoveValid[iPosition][jPosition + i] = true;
						i++;
					}
					if (jPosition + i <= 7 && checkIfPieceBlack(chessArrayBeta[iPosition][jPosition + i]))
					{
						isMoveValid[iPosition][jPosition + i] = true;
					}
					i = 1;
					while (iPosition + i <= 7 && chessArrayBeta[iPosition + i][jPosition] == (char) ' ')
					{
						isMoveValid[iPosition + i][jPosition] = true;
						i++;
					}
					if (iPosition + i <= 7 && checkIfPieceBlack(chessArrayBeta[iPosition + i][jPosition]))
					{
						isMoveValid[iPosition + i][jPosition] = true;
					}
					
					
					i = 1;
					while (jPosition - i >= 0 && chessArrayBeta[iPosition][jPosition - i] == (char) ' ')
					{
						isMoveValid[iPosition][jPosition - i] = true;
						i++;
					}
					if (jPosition - i >= 0 && checkIfPieceBlack(chessArrayBeta[iPosition][jPosition - i]))
					{
						isMoveValid[iPosition][jPosition - i] = true;
					}
					i = 1;
					while (iPosition - i >= 0 && chessArrayBeta[iPosition - i][jPosition] == (char) ' ')
					{
						isMoveValid[iPosition - i][jPosition] = true;
						i++;
					}
					if (iPosition - i >= 0 && checkIfPieceBlack(chessArrayBeta[iPosition - i][jPosition]))
					{
						isMoveValid[iPosition - i][jPosition] = true;
					}
					
				
				break;
			case 'N':
				if(jPosition + 2 <= 7)
				{
					if(iPosition + 1 <= 7 && !checkIfPieceWhite(chessArrayBeta[iPosition + 1][jPosition + 2]))
					{
						isMoveValid[iPosition + 1][jPosition + 2] = true;						
					}
					
					if(iPosition -1 >= 0 && !checkIfPieceWhite(chessArrayBeta[iPosition - 1][jPosition + 2]))
					{
						isMoveValid[iPosition - 1][jPosition + 2] = true;
					}
				}
				
				if(jPosition - 2 >= 0)
				{
					if(iPosition + 1 <= 7 && !checkIfPieceWhite(chessArrayBeta[iPosition + 1][jPosition - 2]))
					{
						isMoveValid[iPosition + 1][jPosition - 2] = true;						
					}
					
					if(iPosition -1 >= 0 && !checkIfPieceWhite(chessArrayBeta[iPosition - 1][jPosition - 2]))
					{
						isMoveValid[iPosition - 1][jPosition - 2] = true;
					}
				}
				
				
				if(iPosition + 2 <= 7)
				{
					if(jPosition + 1 <= 7 && !checkIfPieceWhite(chessArrayBeta[iPosition + 2][jPosition + 1]))
					{
						isMoveValid[iPosition + 2][jPosition + 1] = true;						
					}
					
					if(jPosition -1 >= 0 && !checkIfPieceWhite(chessArrayBeta[iPosition + 2][jPosition - 1]))
					{
						isMoveValid[iPosition + 2][jPosition - 1] = true;
					}
				}
				
				if(iPosition - 2 >= 0)
				{
					if(jPosition + 1 <= 7 && !checkIfPieceWhite(chessArrayBeta[iPosition - 2][jPosition + 1]))
					{
						isMoveValid[iPosition - 2][jPosition + 1] = true;						
					}
					
					if(jPosition -1 >= 0 && !checkIfPieceWhite(chessArrayBeta[iPosition - 2][jPosition - 1]))
					{
						isMoveValid[iPosition - 2][jPosition - 1] = true;
					}
				}
				
				
				
				break;
			case 'B':
				
				i = 1;
				isFoeA = false;
				isFoeB = false;
				while (jPosition + i <= 7)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition + i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition - i][jPosition + i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition + i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition + i][jPosition + i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
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
				while (jPosition - i >= 0)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition - i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition - i][jPosition - i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition - i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition + i][jPosition - i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
							isFoeB = true;
						}
						else
						{
							isFoeB = true;
						}
						
						
					}
					
					i++;
				}
				
				break;
			case 'K':
				if(iPosition - 1 >= 0)
				{
					if(jPosition - 1 >= 0)
					{
						if(!checkIfPieceWhite(chessArrayBeta[iPosition - 1][jPosition - 1]))
						{
							isMoveValid[iPosition - 1][jPosition - 1] = true;
						}
					}
					if(!checkIfPieceWhite(chessArrayBeta[iPosition - 1][jPosition]))
					{
						isMoveValid[iPosition - 1][jPosition] = true;
					}
					if(jPosition + 1 <= 7)
					{
						if(!checkIfPieceWhite(chessArrayBeta[iPosition - 1][jPosition + 1]))
						{
							isMoveValid[iPosition - 1][jPosition + 1] = true;
						}
					}
					
					
				}
				
				if(jPosition - 1 >= 0)
				{
					if(!checkIfPieceWhite(chessArrayBeta[iPosition][jPosition - 1]))
					{
						isMoveValid[iPosition][jPosition - 1] = true;
					}
				}

				if(jPosition + 1 <= 7)
				{
					if(!checkIfPieceWhite(chessArrayBeta[iPosition][jPosition + 1]))
					{
						isMoveValid[iPosition][jPosition + 1] = true;
					}
				}
				
				
				if(iPosition + i <= 7)
				{
					if(jPosition - 1 >= 0)
					{
						if(!checkIfPieceWhite(chessArrayBeta[iPosition + 1][jPosition - 1]))
						{
							isMoveValid[iPosition + 1][jPosition - 1] = true;
						}
					}
					if(!checkIfPieceWhite(chessArrayBeta[iPosition + 1][jPosition]))
					{
						isMoveValid[iPosition + 1][jPosition] = true;
					}
					if(jPosition + 1 <= 7)
					{
						if(!checkIfPieceWhite(chessArrayBeta[iPosition + 1][jPosition + 1]))
						{
							isMoveValid[iPosition + 1][jPosition + 1] = true;
						}
					}
				}
				break;
			case 'Q':
				i = 1;
				while (jPosition + i <= 7 && chessArrayBeta[iPosition][jPosition + i] == (char) ' ')
				{
					isMoveValid[iPosition][jPosition + i] = true;
					i++;
				}
				if (jPosition + i <= 7 && checkIfPieceBlack(chessArrayBeta[iPosition][jPosition + i]))
				{
					isMoveValid[iPosition][jPosition + i] = true;
				}
				i = 1;
				while (iPosition + i <= 7 && chessArrayBeta[iPosition + i][jPosition] == (char) ' ')
				{
					isMoveValid[iPosition + i][jPosition] = true;
					i++;
				}
				if (iPosition + i <= 7 && checkIfPieceBlack(chessArrayBeta[iPosition + i][jPosition]))
				{
					isMoveValid[iPosition + i][jPosition] = true;
				}
				
				
				i = 1;
				while (jPosition - i >= 0 && chessArrayBeta[iPosition][jPosition - i] == (char) ' ')
				{
					isMoveValid[iPosition][jPosition - i] = true;
					i++;
				}
				if (jPosition - i >= 0 && checkIfPieceBlack(chessArrayBeta[iPosition][jPosition - i]))
				{
					isMoveValid[iPosition][jPosition - i] = true;
				}
				i = 1;
				while (iPosition - i >= 0 && chessArrayBeta[iPosition - i][jPosition] == (char) ' ')
				{
					isMoveValid[iPosition - i][jPosition] = true;
					i++;
				}
				if (iPosition - i >= 0 && checkIfPieceBlack(chessArrayBeta[iPosition - i][jPosition]))
				{
					isMoveValid[iPosition - i][jPosition] = true;
				}
				
				i = 1;
				isFoeA = false;
				isFoeB = false;
				while (jPosition + i <= 7)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition + i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition - i][jPosition + i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition + i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition + i][jPosition + i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
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
				while (jPosition - i >= 0)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition - i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition - i][jPosition - i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition - i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
						}
						else if(checkIfPieceBlack(chessArrayBeta[iPosition + i][jPosition - i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
							isFoeB = true;
						}
						else
						{
							isFoeB = true;
						}
						
						
					}
					
					i++;
				}
				
				break;
			case 'P':
				if (this.chessArrayBeta[iPosition + 1][jPosition] == (char) ' ')
				{
					if (iPosition == 1 && this.chessArrayBeta[iPosition + 2][jPosition] == (char) ' ')
					{
						isMoveValid[iPosition + 2][jPosition] = true;
					}
					isMoveValid[iPosition + 1][jPosition] = true;
				}
				if (jPosition > 0)
				{
					if(checkIfPieceBlack(this.chessArrayBeta[iPosition + 1][jPosition -1]))
							{
								isMoveValid[iPosition + 1][jPosition - 1] = true;
							}
				}
				if (jPosition < 7)
				{
					if(checkIfPieceBlack(this.chessArrayBeta[iPosition + 1][jPosition + 1]))
					{
						isMoveValid[iPosition + 1][jPosition + 1] = true;
					}
				}
				
				break;
			}
			
			
			return isMoveValid;

		}
		
		
				public boolean[][] checkValidMovesBlack(int iPosition, int jPosition, char piece)
		{
			boolean isMoveValid[][] = new boolean[8][8];
			int i = 1;
			boolean isFoeA = false;
			boolean isFoeB = false;
			switch (piece)
			{
			case 'r':
				
					i = 1;
					while (jPosition + i <= 7 && chessArrayBeta[iPosition][jPosition + i] == (char) ' ')
					{
						isMoveValid[iPosition][jPosition + i] = true;
						i++;
					}
					if (jPosition + i <= 7 && checkIfPieceWhite(chessArrayBeta[iPosition][jPosition + i]))
					{
						isMoveValid[iPosition][jPosition + i] = true;
					}
					i = 1;
					while (iPosition + i <= 7 && chessArrayBeta[iPosition + i][jPosition] == (char) ' ')
					{
						isMoveValid[iPosition + i][jPosition] = true;
						i++;
					}
					if (iPosition + i <= 7 && checkIfPieceWhite(chessArrayBeta[iPosition + i][jPosition]))
					{
						isMoveValid[iPosition + i][jPosition] = true;
					}
					
					
					i = 1;
					while (jPosition - i >= 0 && chessArrayBeta[iPosition][jPosition - i] == (char) ' ')
					{
						isMoveValid[iPosition][jPosition - i] = true;
						i++;
					}
					if (jPosition - i >= 0 && checkIfPieceWhite(chessArrayBeta[iPosition][jPosition - i]))
					{
						isMoveValid[iPosition][jPosition - i] = true;
					}
					i = 1;
					while (iPosition - i >= 0 && chessArrayBeta[iPosition - i][jPosition] == (char) ' ')
					{
						isMoveValid[iPosition - i][jPosition] = true;
						i++;
					}
					if (iPosition - i >= 0 && checkIfPieceWhite(chessArrayBeta[iPosition - i][jPosition]))
					{
						isMoveValid[iPosition - i][jPosition] = true;
					}
					
				
				break;
			case 'n':
				if(jPosition + 2 <= 7)
				{
					if(iPosition + 1 <= 7 && !checkIfPieceBlack(chessArrayBeta[iPosition + 1][jPosition + 2]))
					{
						isMoveValid[iPosition + 1][jPosition + 2] = true;						
					}
					
					if(iPosition -1 >= 0 && !checkIfPieceBlack(chessArrayBeta[iPosition - 1][jPosition + 2]))
					{
						isMoveValid[iPosition - 1][jPosition + 2] = true;
					}
				}
				
				if(jPosition - 2 >= 0)
				{
					if(iPosition + 1 <= 7 && !checkIfPieceBlack(chessArrayBeta[iPosition + 1][jPosition - 2]))
					{
						isMoveValid[iPosition + 1][jPosition - 2] = true;						
					}
					
					if(iPosition -1 >= 0 && !checkIfPieceBlack(chessArrayBeta[iPosition - 1][jPosition - 2]))
					{
						isMoveValid[iPosition - 1][jPosition - 2] = true;
					}
				}
				
				
				if(iPosition + 2 <= 7)
				{
					if(jPosition + 1 <= 7 && !checkIfPieceBlack(chessArrayBeta[iPosition + 2][jPosition + 1]))
					{
						isMoveValid[iPosition + 2][jPosition + 1] = true;						
					}
					
					if(jPosition -1 >= 0 && !checkIfPieceBlack(chessArrayBeta[iPosition + 2][jPosition - 1]))
					{
						isMoveValid[iPosition + 2][jPosition - 1] = true;
					}
				}
				
				if(iPosition - 2 >= 0)
				{
					if(jPosition + 1 <= 7 && !checkIfPieceBlack(chessArrayBeta[iPosition - 2][jPosition + 1]))
					{
						isMoveValid[iPosition - 2][jPosition + 1] = true;						
					}
					
					if(jPosition -1 >= 0 && !checkIfPieceBlack(chessArrayBeta[iPosition - 2][jPosition - 1]))
					{
						isMoveValid[iPosition - 2][jPosition - 1] = true;
					}
				}
				
				
				
				break;
			case 'b':
				
				i = 1;
				isFoeA = false;
				isFoeB = false;
				while (jPosition + i <= 7)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition + i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition - i][jPosition + i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition + i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition + i][jPosition + i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
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
				while (jPosition - i >= 0)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition - i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition - i][jPosition - i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition - i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition + i][jPosition - i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
							isFoeB = true;
						}
						else
						{
							isFoeB = true;
						}
						
						
					}
					
					i++;
				}
				
				break;
			case 'k':
				if(iPosition - 1 >= 0)
				{
					if(jPosition - 1 >= 0)
					{
						if(!checkIfPieceBlack(chessArrayBeta[iPosition - 1][jPosition - 1]))
						{
							isMoveValid[iPosition - 1][jPosition - 1] = true;
						}
					}
					if(!checkIfPieceBlack(chessArrayBeta[iPosition - 1][jPosition]))
					{
						isMoveValid[iPosition - 1][jPosition] = true;
					}
					if(jPosition + 1 <= 7)
					{
						if(!checkIfPieceBlack(chessArrayBeta[iPosition - 1][jPosition + 1]))
						{
							isMoveValid[iPosition - 1][jPosition + 1] = true;
						}
					}
					
					
				}
				
				if(jPosition - 1 >= 0)
				{
					if(!checkIfPieceBlack(chessArrayBeta[iPosition][jPosition - 1]))
					{
						isMoveValid[iPosition][jPosition - 1] = true;
					}
				}

				if(jPosition + 1 <= 7)
				{
					if(!checkIfPieceBlack(chessArrayBeta[iPosition][jPosition + 1]))
					{
						isMoveValid[iPosition][jPosition + 1] = true;
					}
				}
				
				
				if(iPosition + i <= 7)
				{
					if(jPosition - 1 >= 0)
					{
						if(!checkIfPieceBlack(chessArrayBeta[iPosition + 1][jPosition - 1]))
						{
							isMoveValid[iPosition + 1][jPosition - 1] = true;
						}
					}
					if(!checkIfPieceBlack(chessArrayBeta[iPosition + 1][jPosition]))
					{
						isMoveValid[iPosition + 1][jPosition] = true;
					}
					if(jPosition + 1 <= 7)
					{
						if(!checkIfPieceBlack(chessArrayBeta[iPosition + 1][jPosition + 1]))
						{
							isMoveValid[iPosition + 1][jPosition + 1] = true;
						}
					}
				}
				break;
			case 'q':
				i = 1;
				while (jPosition + i <= 7 && chessArrayBeta[iPosition][jPosition + i] == (char) ' ')
				{
					isMoveValid[iPosition][jPosition + i] = true;
					i++;
				}
				if (jPosition + i <= 7 && checkIfPieceWhite(chessArrayBeta[iPosition][jPosition + i]))
				{
					isMoveValid[iPosition][jPosition + i] = true;
				}
				i = 1;
				while (iPosition + i <= 7 && chessArrayBeta[iPosition + i][jPosition] == (char) ' ')
				{
					isMoveValid[iPosition + i][jPosition] = true;
					i++;
				}
				if (iPosition + i <= 7 && checkIfPieceWhite(chessArrayBeta[iPosition + i][jPosition]))
				{
					isMoveValid[iPosition + i][jPosition] = true;
				}
				
				
				i = 1;
				while (jPosition - i >= 0 && chessArrayBeta[iPosition][jPosition - i] == (char) ' ')
				{
					isMoveValid[iPosition][jPosition - i] = true;
					i++;
				}
				if (jPosition - i >= 0 && checkIfPieceWhite(chessArrayBeta[iPosition][jPosition - i]))
				{
					isMoveValid[iPosition][jPosition - i] = true;
				}
				i = 1;
				while (iPosition - i >= 0 && chessArrayBeta[iPosition - i][jPosition] == (char) ' ')
				{
					isMoveValid[iPosition - i][jPosition] = true;
					i++;
				}
				if (iPosition - i >= 0 && checkIfPieceWhite(chessArrayBeta[iPosition - i][jPosition]))
				{
					isMoveValid[iPosition - i][jPosition] = true;
				}
				
				i = 1;
				isFoeA = false;
				isFoeB = false;
				while (jPosition + i <= 7)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition + i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition - i][jPosition + i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition + i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition + i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition + i][jPosition + i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition + i] = true;
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
				while (jPosition - i >= 0)
				{
					if(iPosition - i >= 0)
					{
						if(chessArrayBeta[iPosition - i][jPosition - i] == (char) ' ' && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition - i][jPosition - i]) && !isFoeA)
						{
							isMoveValid[iPosition - i][jPosition - i] = true;
							isFoeA = true;
						}
						else
						{
							isFoeA = true;
						}
						
						
					}
					if(iPosition + i <= 7)
					{
						if(chessArrayBeta[iPosition + i][jPosition - i] == (char) ' ' && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
						}
						else if(checkIfPieceWhite(chessArrayBeta[iPosition + i][jPosition - i]) && !isFoeB)
						{
							isMoveValid[iPosition + i][jPosition - i] = true;
							isFoeB = true;
						}
						else
						{
							isFoeB = true;
						}
						
						
					}
					
					i++;
				}
				
				break;
			case 'p':
				if (this.chessArrayBeta[iPosition - 1][jPosition] == (char) ' ')
				{
					if (iPosition == 6 && this.chessArrayBeta[iPosition - 2][jPosition] == (char) ' ')
					{
						isMoveValid[iPosition - 2][jPosition] = true;
					}
					isMoveValid[iPosition - 1][jPosition] = true;
				}
				if (jPosition > 0)
				{
					if(checkIfPieceWhite(this.chessArrayBeta[iPosition - 1][jPosition -1]))
							{
								isMoveValid[iPosition - 1][jPosition - 1] = true;
							}
				}
				if (jPosition < 7)
				{
					if(checkIfPieceWhite(this.chessArrayBeta[iPosition - 1][jPosition + 1]))
					{
						isMoveValid[iPosition - 1][jPosition + 1] = true;
					}
				}
				
				break;
			}
			
			
			return isMoveValid;

		}
		
		
		
			
	public boolean checkIfPieceWhite(char piece)
	{
		boolean isWhite = false;
		
		switch (piece){
		case 'R':
		case 'N':
		case 'B':
		case 'K':
		case 'Q':
		case 'P':
			isWhite = true;
		
		}
		return isWhite;
	}
		
	public boolean checkIfPieceBlack(char piece)
		{
			boolean isBlack = false;
			
			switch (piece){
			case 'r':
			case 'n':
			case 'b':
			case 'k':
			case 'q':
			case 'p':
				isBlack = true;
			
			}
			return isBlack;
	}
	
 */
}
