
public class _367 {
	public static void main(String[] args) {
		int test = 195;
		System.out.println(isPerfectSquare(test));
	}

	public static boolean isPerfectSquare(int num) { //used the Babylonian method of solving square roots
		if (num <= 0) {
			return false;
		}
       double guess = num / 2;
       double temp;
       while ((temp = (guess + num / guess) / 2) - guess > 0.001 || temp - guess < -0.001) {
    	   guess = temp;
       }
       return ((int) temp * (int) temp) - num < 0.001 && num - ((int) temp * (int) temp) < 0.001;
	}
}
