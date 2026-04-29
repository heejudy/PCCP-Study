class Solution {
    public String solution(int n) {
        String subak = "수박";
        String answer  = "";
        for(int i = 0; i < n; i++){
            answer += subak.charAt(i % 2);
        }
        return answer;
    }
}