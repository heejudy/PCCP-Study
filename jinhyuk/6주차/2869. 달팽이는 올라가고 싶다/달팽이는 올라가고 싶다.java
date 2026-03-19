import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 거리
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 거리
        int V = Integer.parseInt(st.nextToken()); // 총 높이

        // (전체 높이 - 미끄러지는 거리) / (하루 실질 이동 거리)
        // 나머지가 있으면 하루 더 가야 하므로 나머지를 체크하여 +1 해줌
        int days = (V - B) / (A - B);
        
        if ((V - B) % (A - B) != 0) {
            days++;
        }

        System.out.println(days);
    }
}