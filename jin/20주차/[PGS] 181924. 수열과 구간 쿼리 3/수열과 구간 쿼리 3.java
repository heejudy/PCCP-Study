class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            change(arr, query[0], query[1]);
        }
        return arr;
    }
    
    private void change(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}