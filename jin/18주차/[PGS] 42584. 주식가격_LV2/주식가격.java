import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int pastTime = stack.pop();
                answer[pastTime] = i - pastTime;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int pastTime = stack.pop();
            answer[pastTime] = (n - 1) - pastTime;
        }

        return answer;
    }
}