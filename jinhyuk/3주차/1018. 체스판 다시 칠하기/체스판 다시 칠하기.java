
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++){
            board[i] = br.readLine().toCharArray();
        }

        int minCount = 64;

        for (int i = 0; i <= N - 8 ; i++){
            for (int j = 0; j <= M - 8; j++){

                int count = 0;

                for (int x = 0; x < 8; x++){
                    for (int y = 0; y < 8; y++){

                        // 현재 확인 중인 보드의 실제 색깔
                        char currentColor = board[i + x][j + y];
                        char expectedColor = ((x + y) % 2 == 0) ? 'W' : 'B';

                        if (currentColor != expectedColor){
                            count++;
                        }

                    }
                }

                int currenMin = Math.min(count, 64-count);
                
                minCount = Math.min(minCount, currenMin);



            }
        }

        System.out.println(minCount);
        br.close();


    }
}
