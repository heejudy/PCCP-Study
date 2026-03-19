class Solution {
    public int solution(int n) {
        int res;
        int cnt = 0;
        int start = 1;
        int end = 1;

        while(start <= n){
            res = (end - start + 1) * (start + end) / 2;
            if(n < res){
                start++;
            }else if(n > res){
                end++;
            }else {
                cnt++;
                start++;
            }
        }

        return cnt;
    }
}