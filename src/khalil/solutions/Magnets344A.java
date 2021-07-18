package khalil.solutions;

import java.util.Scanner;

public class Magnets344A {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String input = "";
		String prevInput;

		int groups = 0;
		for (int i = 0; i < n; i++) {
			prevInput = input;
			input = in.next();
			groups += input.equals(prevInput) ? 0 : 1;
		}
		System.out.println(groups);
		in.close();
	}
}