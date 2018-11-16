package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwoDArrayDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// array size will always be 6x6
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();
		System.out.println(sumUsingList(arr));
		System.out.println(maxHourGlassSum(arr));
	}

	/**
	 * The only assumption done in this method is that the size of the hourglass
	 * is 3x3. This one will loop through all the starting points in the original
	 * 2D array, and then add their sum into a list.
	 * This method calculates the hourglass manually, that way it doesn't have to
	 * create more nested loops in order to find a value. Not the most elegant way
	 * but seems to be the most efficient way of doing it.
	 * @param arr
	 * @return the maximum value of the list.
	 */
	private static int sumUsingList(int[][] arr) {
		ArrayList<Integer> listOfSums = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[i].length - 2; j++) {
				listOfSums
				    .add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]
				        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
			}
		}
		return Collections.max(listOfSums);
	}

	/**
	 * Assuming that the grid of the array is 6x6 and that the hour glass size is
	 * 3x3...
	 * 
	 * @param arr
	 * @return the maximum sum of all the hourglasses in the array
	 */
	private static int maxHourGlassSum(int[][] arr) {
		int max = 0;
		int temp = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				temp = hourglassSum(arr, i, j);
				if (temp > max || (i == 0 && j == 0)) {
					max = temp;
				}
			}
		}
		return max;
	}

	/**
	 * Assuming that the hourglass has a grid size of 3x3, method calculates the
	 * sum of the values inside the hourglass, ignoring the values that don't form
	 * part of it.
	 * 
	 * @param arr
	 * @param i
	 * @param j
	 * @return sum of all values
	 */
	private static int hourglassSum(int[][] arr, int i, int j) {
		int sum = 0;
		for (int m = i; m <= i + 2; m++) {
			for (int n = j; n <= j + 2; n++) {
				if ((n == j && m == i + 1) || (n == j + 2 && m == i + 1)) {
					continue;
				}
				sum += arr[m][n];
			}
		}
		return sum;
	}

}
