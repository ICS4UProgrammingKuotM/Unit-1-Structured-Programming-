package logging_company;
/*
 * Imported Java utilities so they are able to be used within the project.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logging_Company {
	
	/*
	 * Created by: Kuot Mariak
	 * Created on: 05-Feb-2019
	 * Created for: ICS4U
	 * Day #3 (Logging Company)
	 * Logging Company
	*/
	
	/*
	 * Constant float value for the max weight the truck can carry held in a constant variable within it's own class
	 */
	
	 static final class ConstantMass {
		public final float Max_Carry_Weight = 1100f;	
		
	}
	 
	/* 
	 * Constant values for the different lengths for the logs held in constant float variables within their own class
	 */
	 
	  static final class Log {
		public final float Log_Length1 = 0.25f;
		public final float Log_Length2 = 0.5f;
		public final float Log_Length3 = 1f;	
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Initialized the other classes in the main class so the variables are accessible. 
		 */
		ConstantMass ConstantMass = new ConstantMass();
		Log Log = new Log();
		
		/*
		 * Created a Scanner object so the user is able to input acceptable data into the program
		 */
		Scanner input = new Scanner(System.in);
		
		/*
		 * Created variables to hold different types of data and make it so they can be used locally
		 * userInput stores the imported data from the user.
		 * Length1 stores the float value of the constant first length from the Log class locally
		 * Length2 stores the float value of the constant second length from the Log class locally
		 * Length3 stores the float value of the constant third length from the Log class locally
		 * Max_Weight stores the float value of the Max carry weight of the truck locally
		 * Log_Weight stores the float value of the weight of the log calculated with a formula but for now is 0 so it's initialized
		 * Num_Of_Logs stores the float value of the number of logs that the truck can hold which is also a formula but for now is 0 for initialization purposes
		 * count is used for error checking purposes of my try-catch method
		 * maxTries is also used for error checking purposes it is essentially the max amount of tries the program will let you get wrong before it crashes
		 * Answer_Input stores the string value that the user inputs on a future prompt
		 * Acceptable_Length stores a boolean value that is used to check if the user inputed a proper length
		 * 
		 */
		float userInput = 0;
		float Length1 = Log.Log_Length1;
		float Length2 = Log.Log_Length2;
		float Length3 = Log.Log_Length3;
		float Max_Weight = ConstantMass.Max_Carry_Weight;
		float Log_Weight = 0;
		float Num_Of_Logs = 0;
		int count = 0;
		int maxTries = 5;
		String Answer_Input = "";
		boolean Acceptable_Length = false; 
		
		/*
		 * A while loop is used here to continuously execute the try-catch code for error checking
		 * this while loop will always remain true so it runs infinitely
		 */
		while (true) {
			
			/*
			 * The try here is used to execute the while loop and the main code of the program within it if there are no errors 
			 */
			try {
				
				/*
				 * This while loop executes continuously until Acceptable_Length is false
				 */
				while (Acceptable_Length == false) {
					
					/*
					 * This displays the prompt the program asks the user which is "What is the length of the log" along with the options of acceptable log lengths
					 * \n is used to break lines in the display so text appears underneath each other
					 */
					System.out.println("What is the length of the log?" + "\n1: 0.25\n2: 0.5\n3: 1");
					
					/*
					 * This reads the input from the user as a float and assigns it to the userInput variable
					 */
					userInput = input.nextFloat();
					/*
					 * This checks to see if the user inputed the same value of the first length and if they did it executes the following code
					 */
					if (userInput == Length1) {
						
						/*
						 * This displays a confirmation prompt of Yes or No asking the user if what they entered is actually what they entered 
						 * This is for if the user didn't mean to put in a certain length or if they happened to change their mind on which length they wanted
						 */
						System.out.println("Is this length you entered: " + userInput + "?" + "\n Yes\n No");
						/*
						 * This changes the boolean value of Acceptable_Length to true telling the program that what the user inputed is a correct log length
						 */
						Acceptable_Length = true;
						
						/*
						 * This reads the next input from the user as a string value and assigns it to Answer_Input so they are able to answer the prompt
						 */
						Answer_Input = input.next();
						
						/*
						 *  This checks to see if the user inputed Yes and if they have it executes the following code
						 */
						if(Answer_Input.equals("Yes")) {
							
							/*
							 *  This is the formula to calculate the weight of the log which is 20kg times the length of the log afterwards it assigns the answer to Log_Weight
							 */
							Log_Weight = userInput * 20;
							
							/*
							 *  This is the formula to calculate how many logs can fit on the truck by dividing the Max carry weight of the truck by the Log weight that was calculated beforehand
							 */
							Num_Of_Logs = Max_Weight / Log_Weight;
							
							/*
							 * This displays how much you a log would weigh based on the first length and it displays how many logs will be able to fit on the truck 
							 */
							System.out.println("The weight of the logs for " + userInput + "m" + " is\n" + Log_Weight + "kg" + "\nThe number of logs that can fit on the truck is\n" + Num_Of_Logs);
							
							/*
							 *  This closes the Scanner object to prevent unnecessary resource leakage that would come from leaving it open to do nothing
							 */
							input.close();
							
							/*
							 *  This checks to see if the user inputed No or any other invalid answer and if they did it changes the boolean of the Acceptable_Length variable to false, effectively continuing the loop so it's able to keep checking
							 */
						}else  {
							Acceptable_Length = false;
						}
						
					}
					/*
					 * Repeats the above process but instead it checks to see if the user inputed the same value as the second length
					 */
					else if (userInput == Length2) {
						System.out.println("Is this length you entered: " + userInput + "?" + "\n Yes\n No");
						Acceptable_Length = true;
						Answer_Input = input.next();
						if(Answer_Input.equals("Yes")) {
							Log_Weight = userInput * 20;
							Num_Of_Logs = Max_Weight / Log_Weight;
							System.out.println("The weight of the logs for " + userInput + "m" + " is\n" + Log_Weight + "kg" + "\nThe number of logs that can fit on the truck is\n" + Num_Of_Logs);
							input.close();
						}else  {
							Acceptable_Length = false;
						}
						
					}
					/*
					 * Repeats the above process but instead it checks to see if the user inputed the same value as the third length
					 */
					else if (userInput == Length3) {
						System.out.println("Is this length you entered: " + userInput + "?" + "\n Yes\n No");
						Acceptable_Length = true;
						Answer_Input = input.next();
						if(Answer_Input.equals("Yes")) {
							Log_Weight = userInput * 20;
							Num_Of_Logs = Max_Weight / Log_Weight;
							System.out.println("The weight of the logs for " + userInput + "m" + " is\n" + Log_Weight + "kg" + "\nThe number of logs that can fit on the truck is\n" + Num_Of_Logs);
							input.close();
						}else  {
							
							Acceptable_Length = false;
						}
					}else
						/*
						 *  This is used to check if they user enters a float value that is not one of the accepted values which then displays the prompt that they inputed a invalid length value
						 *  Error checking
						 */
					{
						System.out.println("Sorry that length is not accepted, please enter an acceptable length");
					}
				}
				/*
				 * This is used to catch Input Mismatch Exceptions specifically which essentially detects if the user inputs a string instead of float when prompted vice versa or they input a string and a float value together like rt5t4
				 * This will catch the error so the program won't crash but it won't run infinitely so the user is unable purposely input incorrect values
				 * Every time it catches an error it will set the Acceptable_Length to false so it restarts the while loop
				 * It will only search for the next line of input so it doesn't just loop itself multiple times after catching only one error
				 * Every time it catches an error the increment will increase until it is equal to the amount of maxTries then it will crash 
				 * The number of Tries left is calculated and assigned through the TriesLeft variable which will then display how many tries you have remaining till the program will crash 
				 */
			}catch (InputMismatchException e) {
				System.out.println("Sorry you entered invalid characters");
					Acceptable_Length = false;
					input.nextLine();
					if (++count == maxTries) throw e;
					int TriesLeft = maxTries - count;
					System.out.println("You have " + TriesLeft + " tries left");
			}
					
		}
		 
		
							
					
							
				
										
			
			
	
				 
			
		
		
			
			
		
	
		
		
		
	
	}
}
