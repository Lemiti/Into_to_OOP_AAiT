import java.util.Scanner;
import java.util.Scanner;

public class RPS_game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Wel-come to Rock paper Scissor game!\nInput your username:");
		System.out.print(">>>>");
		String username = input.nextString();
		System.out.println("Hello "+username"!");
		
		int score = 0;
		int draw = 0;
		char playChoice;
		int played;
		char userChoice;
		boolean condition = true;
		
		int computerChoice;
		//Computer choose using random numbers 1-3 


		do {
			if (played < 1) {
				System.out.println("Do you want to play the game?(Press 'y' for yes or 'n' for no");
				playChoice = input.nextChar();
				if (playChoice = 'y' || playChoice = 'Y') {
					System.out.println("What is your choice?(R:rock, P:Paper, S:Scissor)");
					userChoice = input.nextChar();
					//condition will be implemented
				}
			} else {
				System.out.println("Do you want to continue the game? \n(Press 'y' for yes or 'n' for no.)");
				playChoice = input.nextChar();
				switch (playChoice) {
					case ('y' || 'Y'):
						System.out.println("What is your choice?(R: rock, P: paper,S: Scissor) ");
						userChoice = input.nextChar();
						//here condition will be implemented

						break;
					case ('n' || 'N') :
						condition = false;
						//the game will end and the result will be displayed on screen
						break;
					default:
						System.out.println("Invalid input");
					
				}

			}
		} while (condition);
	}
}
