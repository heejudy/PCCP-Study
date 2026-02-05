import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 필요한 나무의 길이

        int[] trees = new int[N];
        long max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max) {
                max = trees[i]; // 가장 높은 나무 찾기
            }
        }

        // 이분 탐색 (절단기의 높이 H를 탐색)
        long start = 0;
        long end = max;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    sum += (tree - mid);
                }
            }

            if (sum >= M) {
                // 나무를 충분히 얻었으므로, 높이를 더 높여본다 (최댓값 찾기)
                result = mid;
                start = mid + 1;
            } else {
                // 나무가 부족하므로, 높이를 낮춰야 한다
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}