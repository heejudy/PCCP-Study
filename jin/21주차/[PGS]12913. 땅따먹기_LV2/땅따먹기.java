class Solution {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            // 이전 행에서 자신과 같은 열을 제외한 나머지 3개의 열 중 가장 큰 값을 찾아 현재 값에 더함
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        int answer = 0;
        int lastRowIdx = land.length - 1;
        
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[lastRowIdx][i]);
        }

        return answer;
    }
}