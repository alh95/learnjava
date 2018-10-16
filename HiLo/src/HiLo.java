import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int genNum = (int)(Math.random()*100 + 1);
		//System.out.println(genNum);
		
		int guess = 0;
		System.out.println("Guess a number between 1 and 100: ");
		guess = scan.nextInt();
		
		String playAgain = "";
		
		do {
			while(genNum != guess) {
				if(guess > genNum){
					System.out.println("Guess "+ guess + " too high!");
				}
				else if(guess < genNum) {
					System.out.println("Guess "+ guess + " too low!");
				}
				System.out.println("Guess again: ");
				guess = scan.nextInt();
			}
			
			System.out.println(guess +" is correct! Play again (y/n)?");
			playAgain = scan.next();
		} while(playAgain.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for playing!");
		scan.close();
	}
}
