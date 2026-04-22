import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights){
		Queue<Integer> bridge = new LinkedList<>();

		for(int i=0; i<bridge_length; i++){
			bridge.offer(0);
		}
		int answer = 0;
		int sum = 0;
		int index = 0;

		while (truck_weights.length > index){
			answer++;
			sum -= bridge.poll();
			if(sum + truck_weights[index] <= weight){
				sum += truck_weights[index];
				bridge.offer(truck_weights[index]);
				index++;
			} else {
				bridge.offer(0);
			}
		}

		return answer + bridge_length;
	}
}