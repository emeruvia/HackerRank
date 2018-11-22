import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailDuplicates {

	public static void main(String[] args) {
		
		String s = "eme.r.u.v+ia@gmail.com";
		String ar[] = s.split("@");
		for (String name: ar) {
			String parsed = parser(name);
			System.out.println(parsed);
		}
	}
	
	static String parser(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == '.') {
				continue;
			} else if (c == '+') {
				break;
			}
			sb.append(c);
		}
		return sb.toString();
	}
	
	static int solution(String[] L) {
		Map<String, Integer> uniqueEmails = new HashMap<>();
		List<Email> emailList = new ArrayList<>();
		// For every email in the string
		for (String address : L) {
			String split[] = address.split("@");
			emailList.add(new Email(split));
		}
		return 0;
	}
	
	static boolean sameDomain(String s) {
		return false;
	}
	
}

class Email {
	String localName;
	String domainName;
	public Email(String email[]) {
		this.localName = email[0];
		this.domainName = email[1];
	}
}