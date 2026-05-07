import java.lang.StringBuilder;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder("");
        
        int length = phone_number.length(); // 전화번호 전체 길이
        int cnt = 0;
        
        for(char digit : phone_number.toCharArray()){
            cnt++;
            if(length - cnt < 4){
                sb.append(digit);
            } else {
                sb.append("*");
            }
        }
        
        return sb.toString();
    }
}