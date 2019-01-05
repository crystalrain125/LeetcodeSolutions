import java.util.Arrays;

public class _462 {

	public static void main(String[] args) {
		int[] test = {1,2,3,4,3};
		System.out.println(minMoves2(test));
	}
	
	public static int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int sum = 0, median = nums[nums.length / 2];
		for (int val : nums) {
			sum += Math.abs(val - median);
		}
		return sum;
	}
}
