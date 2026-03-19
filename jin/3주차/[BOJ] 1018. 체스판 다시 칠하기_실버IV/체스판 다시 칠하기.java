import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행의 수
        int M = Integer.parseInt(st.nextToken()); // 열의 수

        // 주어진 행과 열의 보드 값 저장하기
        int[][] board = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                board[i][j] = line.charAt(j);
            }
        }

        // 최대로 다시 칠해야 하는 수 => 8 X 8 = 64;
        int min = 64;

        // 가능한 시작점 (N - 8) * (M - 8) 가지 경우
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

                // 가능한 경우의 수들에서 칠해야 하는 수 계산
                int count = findMinPaint(i, j, board);

                // 기존 값보다 더 작은 값 저장
                if(min > count) min = count;
            }
        }

        System.out.println(min);

    }

    public static int findMinPaint(int startX, int startY, int[][] board){
        int count = 0;
        
        // 'W'로 시작하는 판이라고 가정
        char color = 'W';

        for (int i = startX; i < startX + 8; i++){
            for (int j = startY; j < startY + 8; j++) {
                if(board[i][j] != color){
                    count++;
                }
                // 다음 칸의 색은 현재 색과 달라야 함
                color = (color == 'W') ? 'B' : 'W';
            }
            // 다음 줄의 색은 현재 색과 달라야 함
            color = (color == 'W') ? 'B' : 'W';
        }

        //만약 어떤 칸이 'W 시작 판'과 다르다면, 그 칸은 'B 시작 판'과는 일치한다는 뜻
        //반대로 어떤 칸이 'W 시작 판'과 일치한다면, 그 칸은 'B 시작 판'과는 다르다는 뜻
        return Math.min(count, 64 - count);
    }
}