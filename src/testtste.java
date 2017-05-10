
public boolean[][] checkValidMovesBlack(int iPosition, int jPosition, char piece)
		{
			boolean isMoveValid[][] = new boolean[8][8];
			int i = 1;
			boolean isFoeA = false;
			boolean isFoeB = false;
			switch (piece)
			{

			case 'N':
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
			case 'K':
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
			case 'Q':
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
			case 'P':
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