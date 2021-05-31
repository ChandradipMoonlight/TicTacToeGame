package workshop1;

import java.util.Scanner;

public class TicTacToeGame {
	public static char[] createBoard() {
		char[] board = new char[10];
	
		for (int i=1; i<10; i++) {
			board[i] = ' ';
		}
		return board;
	}
		public static void chooseOption () {
		
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
	}
		
		public static void displayBoard() {
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
		}
	public static void main(String[] args) {	
	System.out.println("Welcome to the TicTacGame");
	chooseOption();
	displayBoard();
	}

}
