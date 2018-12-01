import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 4, 3, 5, 1, 2 };
		System.out.println(secondTry(a));
	}

	static int secondTry(int A[]) {
		List<Integer> sumList = new ArrayList<>();
		int first = -1;
		int second = -1;
		int sum = 1;
		boolean consecutive = false;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(sum);
			if (!consecutive) {
				first = A[i];
				consecutive = true;
				sum++;
			} else {
			if (A[i] != first && consecutive) {
				second = A[i];
				sum++;
			}
			if (A[i+1] != first || A[i+1] != second) {
				sumList.add(sum);
					consecutive = false;
					sum = 1;
				}
			}
		}
		
		return Collections.max(sumList);
	}
	
	static int solution(int A[]) {
		// write your code in Java SE 8
		int firstBasket = A[0];
		System.out.println(firstBasket);
		// negative 1 since the values range from 1-1billion
		int secondBasket = -1;
		int count = 1;
		boolean same = false;
		for (int i = 0; i < A.length; i++) {
			if (i == 0)
				count++;
			if (A[i] != firstBasket && !same) {
				secondBasket = A[i];
				System.out.println(secondBasket);
				same = true;
			}
			if (A[i] == firstBasket || A[i] == secondBasket) {
				System.out.println(A[i] + " is being added");
				count++;
			} else {
				count--;
			}
		}
		return count;
	}
}
