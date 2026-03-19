import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double M = 0;
        int N = Integer.parseInt(br.readLine());
        double[] scores = new double[N];

        // 1. 대입 + 최댓값 찾기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            M = Math.max(M, scores[i]);
        }

        // 2. 값 가공
        double sum = 0;
        for (int i = 0; i < N; i++){
            sum += (scores[i] / M) * 100;
        }
        
        System.out.println(sum / N);
    }
}