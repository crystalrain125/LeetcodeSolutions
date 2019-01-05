
public class _27 {
	public static void main(String[] args) {
		int[] test = {1,1};
		System.out.println(removeElement(test, 1));
	}

	public static int removeElement(int[] nums, int val) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (length != 0) {
				if ((nums[i]) == val) {
					nums[i] = nums[length - 1];
					i--;
					length--;
				}
			}
		}
		return length;
	}

}