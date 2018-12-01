import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BundleShopping {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		List<Integer> list2 = new ArrayList();
		list.add(20);
		list.add(19);
		list2.add(24);
		list2.add(20);
		int n = 50;
		System.out.println(solution(n, list, list2));
	}

	
	
	public static int solution(int n, List<Integer> list, List<Integer> list2) {
		int max = n;
		int total = 0;
		int maxbooks = 0;
		// loop through every value of the list
		for (int i = 0; i < list.size(); i++) {
			int amount = list.get(i);
			int price = list2.get(i);
			if (n % amount < max) {
				int books = (n / price) * amount;
				if (books > maxbooks) {
					maxbooks = books;
				}
			}
		}
		return maxbooks;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int budgetShopping(int n, List<Integer> bundleQuantities,
	    List<Integer> bundleCosts) {
		int sum = 0;
		int max = Collections.max(bundleQuantities);
		int price = bundleCosts.get(bundleQuantities.indexOf(max));
		int minCost = Collections.min(bundleCosts);
		if (minCost > n)
			return 0;
		if (n >= price) {
			n -= price;
			sum = max + budgetShopping(n, bundleQuantities, bundleCosts);
		} else if (bundleQuantities.size() > 0 && bundleCosts.size() > 0){
			bundleQuantities.remove(max);
			bundleCosts.remove(price);
			sum += budgetShopping(n, bundleQuantities, bundleCosts);
		}
		return sum;
	}

}
