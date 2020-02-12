package einstein_equation;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Einstein_Equation {

	public static final class SpeedOfLight {
		
		public static final double c = 2.988 * Math.exp(8);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		DecimalFormat numFormat = new DecimalFormat("0.000E0");
		
		double c = SpeedOfLight.c;
		double mass = 0;
		double Energy = 0;
		double Kiloton_Bomb = 0;
		double Megaton_Bomb = 0;
		double userInput;
		String answerInput;
		
		
		
		
		
		
		
		System.out.println("What is the mass of the object(kg)?");
		userInput = input.nextDouble();
		mass = userInput;
		Energy = mass * Math.pow(c, 2);
		
		System.out.println("What unit of measurement would you like energy in?\nJoules(J)\nKiloJoules(kJ)\nTeraJoules(TJ)");
		
		
		System.out.println(numFormat.format(Energy) + " J");
		Kiloton_Bomb = Energy / 4.18E12;
		
		Energy = Energy / 1000;
		System.out.println(numFormat.format(Energy) + " kJ");
		Kiloton_Bomb = Energy / 4.18E9;
		
		Energy = Energy / 1.0E12;
		System.out.println(numFormat.format(Energy) + " TJ");
		Kiloton_Bomb = Energy / 4.184;
		
		
		
		
		
	}

}
