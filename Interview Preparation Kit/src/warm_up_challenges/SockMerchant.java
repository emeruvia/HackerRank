package warm_up_challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		System.out.println(sockMerchant(n, ar));
	}

	/**
	 * Method checks for pairs in the int array. The reason behind
	 * using a set is we always check if the set already contains
	 * the current value, this would mean that there is a matching pair
	 * in the table. After you increment the value of pairs, this value
	 * is consumed from the table, that way next iteration that the
	 * value appears, this one will have to be re-introduced to the table
	 * and wait to check if it receives a pair.
	 * @param n
	 * @param ar
	 * @return
	 */
	private static int sockMerchant(int n, int ar[]) {
		Set<Integer> socks = new HashSet<Integer>();
		int pairs = 0;
		for (int i : ar) {
			if (socks.contains(i)) {
				pairs++;
				socks.remove(i);
			} else {
				socks.add(i);
			}
		}
		return pairs;
	}
}
