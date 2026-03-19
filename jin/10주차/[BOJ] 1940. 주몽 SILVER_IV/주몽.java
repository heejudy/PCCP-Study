import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());      // 재료의 개수
        int M = Integer.parseInt(br.readLine());      // 갑옷을 만드는데 필요한 수

        String[] str = br.readLine().split(" ");
        int count = 0;
        
        for (int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++){
                if(Integer.parseInt(str[i]) + Integer.parseInt(str[j]) == M) count++;
            }
        }

        System.out.println(count);
    }
}