import java.util.*;
class Solution {
	public int solution(int n, int k, int[] enemy) {
		/*
		for (int i = 0; i < enemy.length; i++) {
			int[] temp = Arrays.copyOfRange(enemy, 0, i + 1);
			Arrays.sort(temp); // temp = { 1, 2, 3, 3, 4, 4, 5};

			int sum = 0;
			for (int j = 0; j < temp.length - k; j++) {
				sum += temp[j];
			}

			if (sum > n) {
				return i;
			}
		}
		return enemy.length;
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < enemy.length; i++) {
			n -= enemy[i];
			pq.offer(enemy[i]);

			if (n < 0) {
				if (k > 0) {
					n += pq.poll(); // 지금까지 나온 적 중 가장 큰 값에 무적권 사용
					k--;
				} else {
					return i;
				}
			}
		}

		return enemy.length;
	}
}