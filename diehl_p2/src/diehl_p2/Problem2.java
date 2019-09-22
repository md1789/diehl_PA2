package diehl_p2;
import java.util.Scanner;

public class Problem2 {
	static float weight, height, BMI;
	static boolean system;
	static String type;
	public static float square() {
		return (height * height);
	}
	public static void BMI_Calc () {
		height = square();
		if (system == true) {
			BMI = weight / height;
		}
		
		else {
			BMI = 703 * (weight / height);
		}
		
		System.out.printf("Your BMI is: " + BMI);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		weight = input.nextFloat();
		System.out.println("Is your weight in lbs or kgs?");
		type = input.next();
		if (type.equals("lbs")) {
			system = false;
		}
		
		else if (type.equals("kgs")) {
			system = true;
		}
		/*else {
			System.out.println("Error: must be typed lbs or kgs.");
		}*/
		System.out.println("What is your height? (Inches with lbs and meters with kilograms)");
		height = input.nextFloat();
		BMI_Calc();
		input.close();
	}

}
