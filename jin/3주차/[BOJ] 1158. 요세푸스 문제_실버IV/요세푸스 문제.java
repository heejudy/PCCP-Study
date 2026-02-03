import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        int N;  // N명
        int K;  // K번째 인덱스


        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        StringJoiner sj = new StringJoiner(", ", "<", ">");

        N = scanner.nextInt();
        K = scanner.nextInt();

        // 큐 채우기
        for (int i = 0; i < N; i++) {
            queue.offer(i+1);
        }

        while (!queue.isEmpty()){
            // K - 1번째 인덱스까지 다시 큐에 넣기
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            sj.add(queue.poll().toString());
        }

        System.out.println(sj);
    }
}
