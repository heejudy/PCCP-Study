import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int cnt = 0;
        
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            int[] cutArr = new int[j - i + 1];
            
            int idx = 0;
            
            for(int m = i; m <= j; m++){
                cutArr[idx] = array[m - 1];
                idx++;
            }
            
            Arrays.sort(cutArr);
            
            answer[cnt] = cutArr[k - 1];
            cnt++;
        }
            
        return answer;
    }
}