package diehl_p3;
import java.util.Scanner;
public class Problem3 {
	static String[] topics = {"Technology", "Sports", "Art", "Science", "Entertainment"};
	final static int NUM_TOPICS = 5;
	static int[][] responses = new int[5][10];
	static int count = 0, freq = 0;
	static int[] avg = new int[NUM_TOPICS];
	static int rating, col, total = 0, min = 10, max = 0;
	static char in;
	public static void Survey() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < NUM_TOPICS; i++) {
			for (int j = 0; j < 10; j++) {
				responses[i][j] = 0;
			}
		}
		while (in != 'q') {
			System.out.println("Type s to start and q to quit.");
			in = input.next().charAt(0);
			if (in == 's') {
				for (int i = 0; i < NUM_TOPICS; i++) {
					total = 0;
					System.out.println("Rate " + topics[i] + " from 1-10 (1 being the"
							+ " least important to you, 10 being the most important.");
						// prompt user to rate each topic from 1-10 (describe rating system)
						// getting the rating and putting the frequency inside
						rating = input.nextInt();
						col = rating - 1;
						responses[i][col]++;
						for (int j = 0; j < 10; j++) {
							total += responses[i][j];
							if (avg[i] <= min) {
								min = i;
							}
							
							if (avg[i] >= max) {
								max = i;
							}

						}
						avg[i] = total / 10;
				}
			}
		}
		System.out.println("The topic with the lowest point total is: " + topics[min]);
		System.out.println("The topic with the highest point total is: " + topics[max]);
		String space = "               ";
		String leading = "  ";
		String[] spacers = {"   ", "       ", "          ", "      ", ""};
		System.out.println(space + "1" + leading + "2" + leading + "3" + leading + "4" 
		+ leading + "5" + leading + "6" + leading + "7" + leading + "8" + leading + "9" 
		+ leading + "10" + leading + "Avg");
		for (int i = 0; i < NUM_TOPICS; i++) {
			System.out.println(topics[i] + spacers[i] + leading + responses[i][0] + leading + responses[i][1] + leading +
					+ responses[i][2] + leading + responses[i][3] + leading + responses[i][4] + leading + 
					responses[i][5] + leading + responses[i][6] + leading + responses[i][7] +
					leading + responses[i][8] + leading + responses[i][9] + leading + avg[i]);
		}
		input.close();
	}
	public static void main(String[] args) {
		Survey();

	}

}
