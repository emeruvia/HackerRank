
public class FizzBuzz {

	public static void main(String[] args) {
		int ar[] = {3, 5};
		int range = 100;
		fizzbuzz(ar, range);
	}
	
	static void fizzbuzz(int multipliers[], int range) {
		for (int i = 1; i <= range; i++) {
			String value = "";
			value += (i % 3 == 0) ? "fizz" : "";
			value += (i % 5 == 0) ? "buzz" : "";
			if (value.length() > 0) {
				System.out.println(value);
			} else {
				System.out.println(i);
			}
		}
	}
}
