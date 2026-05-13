class Solution {
    public String solution(String s) {
        int max;
        int min;
        
        String[] numbers = s.split(" ");
        max = min = Integer.parseInt(numbers[0]);
        for(String num : numbers){
            int n = Integer.parseInt(num);
            if(n > max) max = n;
            else if (n < min) min = n;
        }
        
        return min + " " + max;
    }
}