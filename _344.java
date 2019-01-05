public class _344 {
	public static void main(String[] args) {
		String test = "hi";
		System.out.println(reverseString(test));
	}
	
	public static String reverseString(String s) {
		int len = s.length();
		char[] str = new char[len];
		char[] initial = s.toCharArray();
		for (int i = 0; i < len; i++) {
			str[i] = initial[len-1-i];
		}
		return new String(str);
	}
}
