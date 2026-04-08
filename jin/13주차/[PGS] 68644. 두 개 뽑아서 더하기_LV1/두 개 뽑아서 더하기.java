import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> answer = new ArrayList<>(set);
        Collections.sort(answer);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}