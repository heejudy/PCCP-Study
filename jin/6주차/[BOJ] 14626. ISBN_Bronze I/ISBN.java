import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 1. 체크 숫자 확인
        int m = input.charAt(input.length() - 1) - '0';
        int d_idx = input.indexOf('*');
        int weight;

        // 2. 훼손값 처리
        // 인덱스 짝수 -> 가중치 1
        // 인덱스 홀수 -> 가중치 3
        int sum = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            // 훼손값 만나면 넘어가기
            if(i == d_idx) continue;
            if (i % 2 == 0){
                weight = 1;
            } else {
                weight = 3;
            }
            sum += (input.charAt(i) - '0') * weight;
        }

        weight = (d_idx % 2 == 0) ? 1 : 3;
        for (int x = 0; x <= 9; x++) {
            if ((sum + (x * weight) + m) % 10 == 0) {
                System.out.println(x);
                break;
            }
        }
    }
}