import java.util.*;

class Solution {
	public String solution(String my_string, int[] indices) {
		Arrays.sort(indices);

		ArrayList<Character> resultList = new ArrayList<>();

		int deleteIdx = 0;
		for (int i = 0; i < my_string.length(); i++) {

			// 3. 현재 인덱스(i)가 삭제 리스트(indices[deleteIdx])에 포함되어 있는지 확인
			if (deleteIdx < indices.length && i == indices[deleteIdx]) {
				// 삭제 대상이면 추가하지 않고 다음 삭제할 인덱스로 포인터 이동
				deleteIdx++;
			} else {
				// 삭제 대상이 아니면 결과 리스트에 추가
				resultList.add(my_string.charAt(i));
			}
		}

		StringBuilder sb = new StringBuilder();
		for (char c : resultList) {
			sb.append(c);
		}

		return sb.toString();
	}
}