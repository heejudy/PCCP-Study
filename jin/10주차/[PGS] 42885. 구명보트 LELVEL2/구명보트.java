import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        
        int i = 0; // 가벼운 사람 인덱스
        int j = people.length - 1; // 무거운 사람 인덱스
        
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
            }            
            j--;
            count++; 
            
        }
        return count;
    }
}