
public class _453 {
	
	public static void main(String[] args) {
		int[] test = {1, 1, 2};
		System.out.println(minMoves(test));
	}
	
	public static int minMoves(int[] arr) {
		int sum = 0, min = arr[0];
		for(int val: arr) {
			sum += val;
			if (min > val) {
				min = val;
			}
		}
		return sum - arr.length * min;
	}
}
