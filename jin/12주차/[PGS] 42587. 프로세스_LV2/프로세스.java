import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Map<String, Integer>> queue = new LinkedList<>();
    
        for (int i = 0; i < priorities.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            map.put("index", i);
            map.put("prior", priorities[i]);
            queue.offer(map);
        }
        
        while (!queue.isEmpty()) {
            int max = queue.stream()
                                .mapToInt(m -> m.get("prior"))
                                .max()
                                .getAsInt();
            
            Map<String, Integer> current = queue.poll();
            
            if (current.get("prior") == max) {
                answer++;
                if (current.get("index") == location) {
                    break;
                }
            } else {
                queue.add(current);
            }
        }
        
        return answer;
    }
}