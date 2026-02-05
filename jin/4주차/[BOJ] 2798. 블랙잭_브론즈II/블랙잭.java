import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(sk.nextToken());  // 카드의 총 개수
        int M = Integer.parseInt(sk.nextToken());  // 넘을 수 없는 값 (3장의 총합)
        int sum = 0;
        int res = 0; // 결과 : M에 최대한 가까운 카드 3장의 합

        int[] arr = new int[N];
        sk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(sk.nextToken());
        }

        for (int i = 0; i < N - 2 ; i++) {
            for(int j = i + 1; j < N - 1; j++){
                for (int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= M){
                        res = Math.max(sum, res);
                    }
                    sum = 0;
                }
            }
        }

        System.out.println(res);
    }
}