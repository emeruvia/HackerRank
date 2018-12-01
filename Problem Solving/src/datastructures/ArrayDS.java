package datastructures;

import java.util.Scanner;

public class ArrayDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int[] rev = reverseArray(arr);
		for (int i = 0; i < rev.length; i++) {
			System.out.println(rev[i]);
		}
	}
	
	static int[] reverseArray(int[] arr) {
		int[] rev = new int[arr.length];
		int revCount = arr.length - 1;
		for (int i = 0; i < arr.length; i++, revCount--) {
			rev[i] = arr[revCount];
		}
		return rev;
	}
	
}
