package interviewPrep;

import java.util.ArrayList;

public class interviewPrepProblems {

	private static boolean returnTrueOrFalse(ArrayList<Integer> list, int number) {
		int contains = 0;
		for (int i = 0; i < list.size(); i++) {
			contains = list.get(i) - number;
			if (contains < 0) {
				contains = -(contains);
			}
			if ((list.contains(contains))) {
				System.out
						.println("List contains the numbers " + " " + contains + " + " + list.get(i) + " = " + number);
				System.out.println("true");
				return true;
			}
		}
		System.out.println("List does not contain the sum of " + " " + number);
		return false;
	}

	public static void main(String[] args) {
		/**
		 * Given a list of numbers and a number k, return whether any two numbers from
		 * the list add up to k. For example, given [10, 15, 3, 7] and k of 17, return
		 * true since 10 + 7 is 17.
		 */

		System.out.println("Hello World");

		ArrayList<Integer> listGen = new ArrayList<>();
		listGen.add(10);
		listGen.add(15);
		listGen.add(7);
		listGen.add(3);

		// returnTrueOrFalse(listGen, 25);
		leetCodeProblem x = new leetCodeProblem();
		int[] passIn = { 1, 4, 3, 4, 5 };
		x.duplicatesInArray(passIn);
	}

}
