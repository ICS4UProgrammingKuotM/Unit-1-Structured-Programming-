package logging_company;

import java.util.Scanner;
public class Logging_Company {
	
	/*
	 * Created by: Kuot Mariak
	 * Created on: 05-Feb-2019
	 * Created for: ICS4U
	 * Day #3 (Logging Company)
	 * Logging Company
	*/
	

	
	 static final class ConstantMass {
		public final float Max_Carry_Weight = 1100f;	
		
	}
	
	  static final class Log {
		public final float Log_Length1 = 0.25f;
		public final float Log_Length2 = 0.5f;
		public final float Log_Length3 = 1f;
		public final float Length[] = {Log_Length1,Log_Length2,Log_Length3};
		
	}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log Log = new Log();
		float Log_Length[] = Log.Length;
		ConstantMass ConstantMass = new ConstantMass();
		float Max_Weight = ConstantMass.Max_Carry_Weight;
		Scanner input = new Scanner(System.in);
		float Log_Weight;
		float Num_Of_Logs = Max_Weight;
		
		System.out.println("What is the length of the log?" + "\n1: 0.25\n2: 0.5\n3: 1");
		float userInput = input.nextFloat();
			if (Log_Length. == userInput) {
				System.out.println("Is the length you entered: " + userInput + "?");
			}
		
			
	}

}
