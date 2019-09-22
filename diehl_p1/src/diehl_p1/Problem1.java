package diehl_p1;
import java.util.Scanner;

public class Problem1 {
	private static int data, dig1, dig2, dig3, dig4, temp1, temp2;
	public static void encrypt() {
		data += 7;
		dig1 = data % 10;
		dig2 = (data / 10) % 10;
		dig3 = (data / 100) % 10;
		dig4 = (data / 1000) % 10;
		
		data = dig3 + (10 * dig4) + (100 * dig1) + (1000 * dig2);
		
		
		System.out.println(data);
		
	}
	public static void decrypt() {
		dig1 = data % 10;
		dig2 = (data / 10) % 10;
		dig3 = (data / 100) % 10;
		dig4 = (data / 1000) % 10;
		
		data = dig3 + (10 * dig4) + (100 * dig1) + (1000 * dig2);
		data -= 7;
		System.out.println(data);
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a four digit integer");
		data = input.nextInt();
		encrypt();
		decrypt();
		input.close();
	}

}
