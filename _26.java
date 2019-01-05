
public class _26 {
	public static void main(String[] args) {
		int[] test = {1,1};
		System.out.println(removeDuplicates(test));
	}
	public static int removeDuplicates(int[] nums) {
        int firstIndex = 0;
        int length = nums.length;
        for(int secondIndex = 1; secondIndex < length; secondIndex++) {
        	while(secondIndex < length && nums[firstIndex] == nums[secondIndex]) {
        		secondIndex++;
        	}
        	if (secondIndex < length) {
        		nums[firstIndex+1] = nums[secondIndex];
        		firstIndex++;
        	}
        }
        return firstIndex+1;
    }
}
