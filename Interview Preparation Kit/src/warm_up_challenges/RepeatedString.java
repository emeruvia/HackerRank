package warm_up_challenges;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();
		System.out.println(repeatedString(s, n));
	}
	
	private static long repeatedString(String s, long n) {
		long multiplier = n / s.length();
		long leftOver = n % s.length();
		return s.length() > n ? letterCounter(s, n) 
				: (multiplier * letterCounter(s, s.length())) + letterCounter(s, leftOver);
	}

	private static long letterCounter(String s, long n) {
		long counter = 0;
		for (int i = 0; i < n; i++){
			if (s.charAt(i) == 'a') {
				counter++;
			}
		}
		return counter;
	}
	
}
