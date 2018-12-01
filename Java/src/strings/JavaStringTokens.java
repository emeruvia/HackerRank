package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringTokenizer st = new StringTokenizer(s, "[ !,?._'@]+");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
