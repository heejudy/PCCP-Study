import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int bridge_weight = 0; 
        Queue<Integer> bridge = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++){
            bridge.add(0);
        }

        int time = 0; 
        int truckIndex = 0; 

        while (truckIndex < truck_weights.length){
            bridge_weight -= bridge.poll();
            int truck_weight = truck_weights[truckIndex];
            if(bridge_weight + truck_weight <= weight){
                bridge.add(truck_weight);
                bridge_weight += truck_weight;
                truckIndex++;
            } else {
                bridge.add(0);
            }
            time++;
        }
        return time + bridge_length;
    }
}