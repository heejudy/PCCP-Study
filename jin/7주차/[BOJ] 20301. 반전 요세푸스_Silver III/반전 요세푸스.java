import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        int cnt = 0;
        boolean isReverse = false;
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                if (!isReverse){
                    queue.add(queue.poll());
                } else {
                    queue.addFirst(queue.pollLast());
                }

            }
            if (!isReverse) {
                result.append(queue.pollFirst()).append("\n");
            } else {
                result.append(queue.pollLast()).append("\n");
            }

            cnt++;
            if (cnt % M == 0) {
                isReverse = !isReverse;
            }
        }

        System.out.println(result);
    }
}