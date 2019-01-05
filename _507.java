public class _507 {

	public static void main(String[] args) {
		int test = 0;
		System.out.println(checkPerfectNumber(test));
	}
	
	public static boolean checkPerfectNumber(int num) {
		if (num == 1 || num == 0) {
			return false;
		}
		int sum = 0, max = num;
		for (int i = 1; i <= max; i++) {
			if (num % i == 0) {
				sum += i;
				sum += num/i;
				max = num/i - 1;
			}
		}
		return sum - num == num;
	}
}