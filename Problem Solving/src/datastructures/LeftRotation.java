package datastructures;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //number of integers
		int k = in.nextInt(); //number of rotations
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		int[] left = leftRotation(ar, k);
		for (int i = 0; i < n; i++) {
			System.out.print(left[i] + " ");
		}
	}
	
	static int[] leftRotation(int[] ar, int k) {
		int[] newAr = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			newAr[(ar.length+i-k) % ar.length] = ar[i];
		}
		return newAr;
	}
	
}
