import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2606 {

	static int N, M; // N: 컴퓨터 수, M: 연결된 쌍의 수
	static boolean[] V; // 방문 여부를 체크할 배열 (방문 시 감염된 것으로 간주)
	static List<Integer>[] B; // 인접 리스트로 그래프 구현
	static int count; // 감염된 컴퓨터의 수를 저장할 변수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 컴퓨터 수 입력 받기
		int M = Integer.parseInt(br.readLine()); // 네트워크 연결 수 입력 받기

		V = new boolean[N+1]; // 컴퓨터 번호가 1번부터 시작하므로 N+1 크기로 생성
		B = new List[N+1];

		for(int i=1; i<N+1; i++) {
			B[i] = new ArrayList<>();
		}

		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			B[s].add(e);
			B[e].add(s);
		}

		count = 0;
		dfs(1);
		System.out.println(count);

	}
	private static void dfs(int now) {
		V[now] = true; // 방문 처리

		for (int next : B[now]) { // 인접한 컴퓨터 확인
			if (!V[next]) { // 아직 방문(감염)하지 않았다면
				dfs(next);
				count++; // 감염된 수 증가
			}
		}
	}
}
