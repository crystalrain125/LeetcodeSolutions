
public class _204 {

	public static void main(String[] args) {
		int test = 0;
		System.out.println(countPrimes(test));
	}
	
	public static int countPrimes(int n) {
		boolean[] composite = new boolean[n];
		int count = 0, val;
		if (n > 0) { //0 is not defined as prime
			count++;
		}
		if (n > 1) { //1 is not defined as prime
			count++;
		}
		for (int i = 2; (val = i * i) < n; i++) {
			while (val < n) {
				if (!composite[val]) {
					count++;
					composite[val] = true;
				}
				val += i;
			}
		}
		return n - count;
	}
}
