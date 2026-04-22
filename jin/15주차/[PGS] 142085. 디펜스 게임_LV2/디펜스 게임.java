import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int cleared = 0;
        
        for (int e : enemy) {
            n -= e;
            pq.add(e);
            
            if (n < 0) {
                if (k > 0) {
                    n += pq.poll();
                    k--;
                } else {
                    break;
                }
            }
            cleared++;
        }
        
        return cleared;
    }
}