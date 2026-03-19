import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_20301 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		Deque<Integer> deque = new ArrayDeque<>();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}
		int count = 0;        // 제거된 사람 수 카운트
		boolean reverse = false; // 현재 방향 (false: 정방향, true: 역방향)

		while (!deque.isEmpty()) {
			if (!reverse) {
				// 정방향: K-1번 앞에서 꺼내 뒤로 보내고, K번째를 제거
				for (int i = 0; i < K - 1; i++) {
					deque.addLast(deque.pollFirst());
				}
				sb.append(deque.pollFirst()).append("\n");
			} else {
				// 역방향: K-1번 뒤에서 꺼내 앞으로 보내고, K번째를 제거
				for (int i = 0; i < K - 1; i++) {
					deque.addFirst(deque.pollLast());
				}
				sb.append(deque.pollLast()).append("\n");
			}

			count++; // 제거 횟수 증가
			if (count == M) {
				reverse = !reverse; // M번 제거할 때마다 방향 반전
				count = 0;          // 카운트 초기화
			}
		}
		System.out.println(sb);
	}
}
