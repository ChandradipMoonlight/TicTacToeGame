package workshop1;

import java.util.Scanner;

public class TicTacToeGame {
	// Method to reset Board
	public static char[] createBoard() {
		char[] board = new char[10];
	
		for (int i=1; i<10; i++) {
			board[i] = ' ';
		}
		return board;
	}
	// Method to allow choose option.
		public static char chooseOption () {
		
			char computersSymbol = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("give the  option 'o' or 'x' : ");
			char option = sc.next().charAt(0);
			if ( option=='o') {
				computersSymbol='x';
			} else if (option=='x'){
				computersSymbol='0';
			} else {
				System.out.print("invalied option: ");
			}
			System.out.println("Players option : "+ option+"\nand computers option is : "+computersSymbol);
			return option;
	}
	// Method to Display the Board	
		public static char[] displayBoard() {
			char[] board = createBoard();
			System.out.print("\n+---+---+---+\n|");
			for (int i=1; i<10; i++) {
				System.out.print(board[i]+"  |");
				if (i%3==0) {
					System.out.print("\n+---+---+---+\n");
					if(i != 9) {
						System.out.print("|");
				}
				}
			}
			return board;
		}
		// Method to move desire location.
		public static char[] moveDesireLocation(char[] board, char chooseOption){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value between 1 to 9 to move");
			int value = sc.nextInt();
			if(board[value] == ' ')
			{
				System.out.println("Ready to move");
			}
			else
			{
				System.out.println("Your desired place is not empty");
			}
			if(value < 1 || value > 9)
			{
				System.out.println("Invalid input please input the valid digit");
			}
			return board;
			
		}
	public static void main(String[] args) {	
	System.out.println("Welcome to the TicTacGame");
	createBoard();
	char position = chooseOption();
	char[] showBoard = displayBoard();
	moveDesireLocation(showBoard, position);
	}

}
