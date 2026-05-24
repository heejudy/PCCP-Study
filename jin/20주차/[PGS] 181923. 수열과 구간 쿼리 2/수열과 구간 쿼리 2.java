class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int idx = 0;
        
        for(int[] query : queries){
            answer[idx] = findMin(arr, query[0], query[1], query[2]);
            idx++;
        }
        
        return answer;
    }
    
    // s와 e사이에 있는 인덱스 i에 대해서 k보다 큰 최소 arr[i] 을 찾는 함수 
    public int findMin(int[] arr, int s, int e, int k){
        int min = 1000000;
        
        for(int i = s; i <= e; i++){
            if(arr[i] > k){
                min = Math.min(min, arr[i]);
            }
        }
        
        if(min == 1000000) return -1;
        
        else return min;
    }
}