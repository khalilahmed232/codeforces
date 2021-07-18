package khalil.solutions;

import java.util.Scanner;

public class InSearchOfEasyProblem1030A {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int input;

		String output = "EASY";
		for (int i = 0; i < n; i++) {
			input = in.nextInt();
			if (input == 1) {
				output = "HARD";
				break;
			}
		}
		System.out.println(output);
		in.close();

	}
}
