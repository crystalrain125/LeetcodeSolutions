
public class _441 {

	public static void main(String [] args) {
		int test = 1804289383;
		System.out.println(arrangeCoins(test));
	}

	public static int arrangeCoins(int n) {
		return (int)((-1 + Math.sqrt(1 + 8.0 * n)) / 2); //note: n must be used as a double for numbers exceeding integer's max val
	}

}
