package dice_game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DiceGameConsole {

	public static Random rdm = new Random();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		int RandomNum = 0;
		
		int min = 0;
		int max = 0;
		
		boolean reset = true;
		
		
		while (reset = true) {
			try {
				System.out.println("Please enter the minimum value for the random number's range");
				
				int userNumber = input.nextInt();
				
				if (userNumber >= 1) {
					
					min = userNumber;
					
					System.out.println("Please enter the maximum value for the random number's range");
					
					userNumber = input.nextInt();
					
					if (userNumber > min) {
						max = userNumber;
						RandomNumGen(min, max);
						
						System.out.println("Would you like to continue?\n Yes\n No");
						String Answer = input.next();
						if (Answer.equalsIgnoreCase("Yes")) {
							Random rdm = new Random();
						}
						else if (Answer.equalsIgnoreCase("No")) {
							System.out.println("Goodbye!");
							reset = false;
							input.close();
							System.exit(0);
						}
						
					}
					else {
						System.out.println("Please enter a number greater than the minimum value");
					}
				}
				else {
					System.out.println("Please enter a number greater than one!");
				}
			}catch (InputMismatchException e) {
				System.out.println("Please enter a number!");
				input.nextLine();
			}
		}
			
		
		
		
		
		
	}
	
	public static void RandomNumGen (int min, int max) {
		
		int RandomNum = rdm.nextInt((max - min) + 1) + min;
		System.out.println("Your random number is " + RandomNum);
	}

}
