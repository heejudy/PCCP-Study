import java.util.*;

public class Solution {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int num : arr) {
			if (list.isEmpty() || list.get(list.size() - 1) != num) {
				list.add(num);
			}
		}
		/*
		int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }
		*/

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}