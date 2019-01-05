import java.util.LinkedList;
import java.util.List;

public class _728 {
	public static void main(String args[]) {
		int testLeft = 4, testRight = 22;
		System.out.println(selfDividingNumbers(testLeft, testRight));
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = left; i <= right; i++) {
			if (dividing(i)) {
				list.add(i);
			}
		}
		return list;
	}
	
	public static boolean dividing(int val) {
		int temp = val, check;
		while (temp != 0) {
			check = temp % 10;
			temp /= 10;
			if (check == 0 || val % check != 0) {
				return false;
			}
		}
		return true;
	}
}
