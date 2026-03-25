import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[M + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= M; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= M; j += i)
                    isPrime[j] = false;
            }
        }

        for(int i = N; i < M + 1; i++){
            if(isPrime[i]) System.out.println(i);
        }
    }
}