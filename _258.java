
public class _258 {

	public static void main(String [] args) {
		int test = 9;
		System.out.println(addDigits(test));
	}

	public static int addDigits(int num) {
		int result = num % 9;
		if (result == 0 && num != 0) {
			result = 9;
		}
		return result;
	}

}
