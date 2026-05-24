class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n * (n + 1)) / 2];
        int num = 1;
        
        int idx = 0;
        int jump = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                answer[idx] = num++;
                
                if (i % 3 == 0) {
                    if (j < n - i - 1) {
                        idx += jump;
                        jump++;
                    }
                } else if (i % 3 == 1) {
                    if (j < n - i - 1) {
                        idx += 1;
                    }
                } else {
                    if (j < n - i - 1) {
                        idx -= jump;
                        jump--;
                    }
                }
            }
            
            if (i % 3 == 0) {
                idx += 1;
            } else if (i % 3 == 1) {
                idx -= jump;
                jump--;
            } else {
                idx += jump;
                jump++;
            }
        }
        
        return answer;
    }
}