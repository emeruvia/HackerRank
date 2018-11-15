package warm_up_challenges;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		System.out.println(countingValleys(n, s));
		in.close();
	}

	private static int countingValleys(int n, String s) {
		int valleys = 0;
		int seaLevel = 0;
		for(char c : s.toCharArray()) {
			switch (c) {
				case 'U':
					seaLevel++;
					break;
				case 'D':
					seaLevel--;
					break;
				default:
					// do nothing
					break;
			}
			if (seaLevel == 0 && c == 'U') {
				valleys++;
			}
//			System.out.println(seaLevel);
		}
		
		return valleys;
	}
}
