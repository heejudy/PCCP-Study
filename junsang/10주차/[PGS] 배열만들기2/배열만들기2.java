import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = l; i <= r; i++) {
            if(i % 5 != 0) continue;

            String s = Integer.toString(i);
            int len = s.length();
            int cnt = 0;

            for(int j = 0; j < len; j++) {
                if(s.charAt(j) == '0'|| s.charAt(j) == '5'){
                    cnt++;
                }
            }

            if(cnt == len) answer.add(i);
        }

        if(answer.size() == 0) answer.add(-1);
        return answer;
    }
}