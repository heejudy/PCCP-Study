import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];    // 원본 순서 저장
        int[] sorted = new int[N];    // 정렬용 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 정렬 수행
        Arrays.sort(sorted);

        // 2. HashMap을 이용해 중복 제거 및 순위 매기기
        Map<Integer, Integer> rankingMap = new HashMap<>();
        int rank = 0;
        for (int value : sorted) {
            // 이미 맵에 있는 값은 건너뛰어 중복 방지
            if (!rankingMap.containsKey(value)) {
                rankingMap.put(value, rank);
                rank++;
            }
        }

        // 3. 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            sb.append(rankingMap.get(key)).append(" ");
        }

        System.out.print(sb.toString());
    }
}