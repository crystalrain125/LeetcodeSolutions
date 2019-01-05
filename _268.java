import java.util.Arrays;

public class _268 {
	public static void main(String[] args) {
		int[] test = {1,1};
		System.out.println(missingNumber(test));
	}

	public static int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int i = 0;
       int length = nums.length;
       while (i < length) {
    	   if (i != nums[i]) {
    		   break;
    	   }
    	   i++;
       }
		return i;
	}
}
