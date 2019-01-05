import java.util.ArrayList;
import java.util.Arrays;


public class _448 {
	public static void main(String[] args) {
		int[] test = {1,1};
		System.out.println(findDisappearedNumbers(test));
	}
	public static ArrayList<Integer> findDisappearedNumbers(int [] nums) {
		Arrays.sort(nums);
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int i = 1;
		int length = nums.length;
		for (int index = 0; index < length; index++) {
			if (i < nums[index]) {
				ret.add(i);
				i++;
				index--;
			} else if (i == nums[index]) {
				i++;
			} else {
				continue;
			}
		}
		while (i <= length) {
			if(!ret.contains(i)) {
				ret.add(i);
			}
			i++;
		}
		return ret;
	}
}
