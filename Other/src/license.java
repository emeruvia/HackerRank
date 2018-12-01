
public class license {

	public static void main(String[] args) {
		
		String s = "2-4A0r7-4k";
		int k = 4;
		System.out.println(s);
		System.out.println(solution(s, k));
		System.out.println(mySolution(s, k));
	}

	static String solution(String s, int k) {
		StringBuilder sb = new StringBuilder();
		sb.append(s.toUpperCase().replaceAll("-", ""));
		// start from the end of the word minus K values. decrement
		// by K 
		for (int i = sb.length() - k; i > 0; i -= k) {
			sb.insert(i, '-');
		}
		
		return sb.toString();
	}
	
	static String mySolution(String s, int k) {
		StringBuilder sb = new StringBuilder();
		char charArray[] = s.toUpperCase().toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (charArray[i] == '-') {
				continue;
			}
			if ((i+1) % k == 0) {
				System.out.println(i + "\tmodulus k: " + i%k + "\tletter: " + charArray[i]);
				sb.append("-");
			}
			sb.append(charArray[i]);
		}
		return sb.reverse().toString();
	}
	
}
