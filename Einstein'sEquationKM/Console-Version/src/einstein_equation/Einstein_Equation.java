package einstein_equation;
/*
 * Created by: Kuot Mariak
 * Created on: 06-Feb-2020
 * Created for: ICS4U
 * Day #5 (Logging Company)
 * Einstein's Equation (Console)...
*/

/*
 * This imports java tools into my project so I can use them
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Einstein_Equation {
	
	/*
	 * Created by: Kuot Mariak
	 * Created on: 6-Feb-2020
	 * Created for: ICS4U
	 * Day #4 (Einstein's Equation)
	 * Einstein's Equation
	*/
	
	public static final class SpeedOfLight {
		/*
		 * This is the constant variable for the speed of light stored in a double
		 */
		public static final double c = 299800000;
		
	}
	
	/*
	 *  This is a method that asks if the user wants to do another calculation a.k.a restart the code
	 *  The method asks for a Scanner object as an argument and is passed the argument by reference
	 *  The method then returns a boolean value
	 */
	public static boolean AskReset(Scanner AskUser) {
		/*
		 *  This is a string variable that holds the user's input
		 */
		String answerInput;
		
		/*
		 *  This boolean variable is used to determine whether the loop will reset in the main class
		 */
		boolean reset = false;
		
		/*
		 *  This boolean variable is used to keep the code in the while loop running depending on whether the user inputs Yes or No
		 */
		boolean AcceptedAnswer = false;
		
		/*
		 *  This while loop is used to keep the code running until the user inputs no 
		 */
		while (AcceptedAnswer == false) {
		
		/*
		 * This displays a string that asks the user if they want to do another calculation 
		 */
		System.out.println("\nWould you like to do another calculation?\nYes\nNo");
		
		/*
		 *  This allows the user to input data as a string then assigns it to the answerInput variable
		 */
		answerInput = AskUser.next();
		
		/*
		 *  This checks if the user's input is equal to the string Yes while ignoring case sensitivity
		 */
		if (answerInput.equalsIgnoreCase("Yes")) {
			/*
			 *  This sets the AcceptedAnswer variable to true breaking the loop which ends the method
			 */
			AcceptedAnswer = true;
			/*
			 *  This sets the reset variable to true and is used to restart the loop in the main class
			 */
			reset = true;
		} 
		/*
		 *  This checks if the user's input is equal to the string No while ignoring case sensitivity
		 */
		else if (answerInput.equalsIgnoreCase("No")) {
			/*
			 *  This sets the AcceptedAnswer variable to true breaking the loop which ends the method
			 */
			AcceptedAnswer = true;
			/*
			 *  This sets the reset variable to false and stops the loop from restarting in the main class
			 */
			reset = false;
			/*
			 *  This displays a good bye message
			 */
			System.out.println("Thank you for using this program!");
			/*
			 *  This closes the Scanner object so it doesn't leak resources
			 */
			AskUser.close();
			/*
			 *  This closes the program
			 */
			System.exit(0);
		}
		/*
		 *  This else statement is used to error check anything that isn't Yes or No and continues the loop
		 */
		else {
			/*
			 *  This displays a message asking the user to input Yes or No
			 */
			System.out.println("Please answer with Yes or No");
			/*
			 *  This sets the AcceptedAnswer to false continuing the while loop
			 */
			AcceptedAnswer = false;
		}
	}
		/*
		 *  This returns the reset variable as a boolean value depending on what the user answered with
		 */
		return reset;
	} 


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  This creates a new Scanner object which is named input that allows the user to input data
		 */
		Scanner input = new Scanner(System.in);
		/*
		 *  This creates a new number format that formats numbers into scientific notation with 3 decimal places i.e 4.345E10
		 */
		DecimalFormat S_Notation = new DecimalFormat("0.000E0");
		/*
		 *  This creates a new number format that formats numbers to only have two decimal places
		 */
		DecimalFormat numFormat = new DecimalFormat("0.00");
		
		/*
		 *  This is a local double variable used to store the Speed of light constant from it's class
		 */
		double c = SpeedOfLight.c;
		/*
		 * A local double variable used to store the mass of the object
		 */
		double mass = 0;
		/*
		 * A local double variable used to store the energy from Einstein's equation (initialized to 0, later calculated with a formula)
		 */
		double Energy = 0;
		/*
		 * A local double variable used to store the amount of Kiloton bombs of TNT equal to the energy calculated with Einstein's equation
		 */
		double Kiloton_Bomb = 0;
		/*
		 * A local double variable used to store the input of the user specifically a double
		 */
		double userInput;
		/*
		 *  A local variable used to store the amount of times an error was caught
		 *  Used for try-catch error checking
		 */
		int count = 0;
		/*
		 * A local variable used to represent the maximum amount of tries the user has before the program no longer catches the errors
		 */
		int maxTries = 5;
		/*
		 * A local variable used for the for loop
		 */
		int tries = 15;
		/*
		 * A local string variable used to store the user's input of a string
		 */
		String answerInput;
		/*
		 * A local boolean variable used to determine if the program will reset/do another calculation/loop will continue depending on the user's input
		 */
		boolean Program_Reset = true;
		
		/*
		 *  This loop is to keep executing the try-catch code, it runs infinitely because it will never be false
		 */
		while (true) {
			/*
			 *  This is used to error check
			 *  The program will keep trying to execute the code because of the while loop and will keep trying until catch stops catching errors
			 *  Used for error checking
			 */
			try {
				/*
				 * This while loop is used to keep executing the code until the user no longer wants to run the program
				 * The loop will stop when Program_Reset is changed to false
				 */
				while (Program_Reset == true) {
					/*
					 * This for loop is used to keep executing the code forever
					 */
					for (int i = 0; i < tries; i++) {
						/*
						 * This displays a messages asking the user to input the mass of the object
						 */
						System.out.println("What is the mass of the object(kg)?");
						/*
						 * This takes the user's input, checks if it's a number(double) and assigns it to userInput
						 */
						userInput = input.nextDouble();
						/*
						 * This assigns the user's input and assigns it to the mass variable
						 */
						mass = userInput;
						/*
						 * This calculates the energy using Einstein's equation with the mass the user inputed and the speed
						 */
						Energy = mass * Math.pow(c, 2);
						/*
						 *  This displays a message asking what unit of measurement you would like the energy in
						 */
						System.out.println("What unit of measurement would you like energy in?\nJoules(J)\nKiloJoules(kJ)\nTeraJoules(TJ)");
						/*
						 * This takes the user's input, checks if it's a string and assigns it to answerInput
						 */
						answerInput = input.next();
						
						/*
						 * This checks to see if the user inputed Joules or J ignoring case sensitivity and executes the code if they have
						 */
						if (answerInput.equalsIgnoreCase("Joules") || answerInput.equalsIgnoreCase("J")) {
							/*
							 * This displays the energy calculated in scientific notation
							 */
							System.out.println("The energy is: " +  S_Notation.format(Energy) + " J");
							/*
							 * This calculates how many kiloton bombs the energy calculated is equal to
							 */
							Kiloton_Bomb = Energy / 4.184E12;
							/*
							 * This displays the how many kiloton bombs the energy calculated is equal to
							 */
							System.out.println("This energy is equivalent to " + numFormat.format(Kiloton_Bomb) + " Kiloton bombs ");
							/*
							 * This breaks the loop
							 */
							break;
						}
						/*
						 * This checks to see if the user inputed KiloJoules or kJ ignoring case sensitivity and executes the code if they have
						 * Same as above^ except it's for kiloJoules
						 */
						else if (answerInput.equalsIgnoreCase("Kilojoules") || answerInput.equalsIgnoreCase("kJ")) {
							Energy = Energy / 1000;
							System.out.println("The energy is: " + S_Notation.format(Energy) + " kJ");
							Kiloton_Bomb = Energy / 4.184E9;
							System.out.println("This energy is equivalent to " + numFormat.format(Kiloton_Bomb) + " Kiloton bombs ");
							break;
						}
						
						/*
						 * This checks to see if the user inputed KiloJoules or kJ ignoring case sensitivity and executes the code if they have
						 * Same as above^ except it's for TeraJoules
						 */
						else if (answerInput.equalsIgnoreCase("Terajoules") || answerInput.equalsIgnoreCase("TJ")) {
							Energy = (Energy / 1.0E12);
							System.out.println("The energy is: " + S_Notation.format(Energy) + " TJ");
							Kiloton_Bomb = Energy / 4.184;
							System.out.println("This energy is equivalent to " + numFormat.format(Kiloton_Bomb) + " Kiloton bombs ");
							break;
							/*
							 * This checks to see if the user inputed anything other than the above Strings and executes the code if they have
							 */
						}else {
							/*
							 * This displays a message telling the user they've entered invalid characters and to try again
							 */
							System.out.println("Sorry you've entered an invalid unit of measurement, please try again");
						}
							
					}
					/*
					 * This calls the AskReset method and passes the input Scanner object by reference as an argument
					 * Assigns the boolean it returns to the Program_Reset variable
					 */
					Program_Reset = AskReset(input);
				
				}
							
				/*
				 * This is used to catch errors specifically InputMismatch errors 
				 * Used for error checking
				 */	
			} catch (InputMismatchException e){
				/*
				 * This displays a message telling the user they've entered invalid characters
				 */
				System.out.println("Sorry you entered invalid characters");
				/*
				 * This checks the next line the user has inputed to see if if the characters are valid or not
				 */
				input.nextLine();
				/*
				 * This increases the count every time an error is caught and if the count is equal to the value of maxTries it will no longer catch errors
				 * This calculates how many tries are left by subtracting the count from the max tries
				 * Then it displays how many tries you have left till the program crashes
				 */
				if (++count == maxTries) throw e;
				int TriesLeft = maxTries - count;
				System.out.println("You have " + TriesLeft + " tries left");
				
			}
		}
		
	
	}

}

