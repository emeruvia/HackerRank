package warm_up_challenges;

import java.util.Scanner;

public class JumpinOnTheClouds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = (int) in.nextInt();
		}
		System.out.println(jumpingOnCloud(c));
	}
	
	private static int jumpingOnCloud(int[] c) {
		int jumps = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (i < c.length - 2 && c[i + 2] == 0) {
				i++;
			}
			jumps++;
		}
		return jumps;
	}
	
}
