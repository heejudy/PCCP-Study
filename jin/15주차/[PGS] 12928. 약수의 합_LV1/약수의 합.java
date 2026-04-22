class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                if(i * i == n){
                    sum += i;
                }
                else {
                    sum += (n / i) + i;
                }
            }
        }
        return sum;
    }
}