class Solution {
	public String solution(String my_string, int n) {
		StringBuilder sb = new StringBuilder();

		int size = my_string.length() - n;

		for (int i = size; i < my_string.length(); i++) {
			sb.append(my_string.charAt(i));
		}

		return sb.toString();
	}
}