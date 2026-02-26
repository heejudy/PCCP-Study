import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_11729 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		// Math.pow() 거듭제곱함수
		// 이동횟수 - 일반항 : (2^N - 1)
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');

		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}
	/*
		N : 원판의 개수
		start : 출발지
		mid : 옮기기 위해 이동해야 장소
		to : 목적지
	 */
	public static void Hanoi(int N, int start, int mid, int to) {
		// 이동할 원반의 수가 1개 일때
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		// 이때 목적지였던 C를 잠시 보조 기둥처럼 활용합니다.
		Hanoi(N - 1, start, to, mid);

		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		sb.append(start + " " + to + "\n");

		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		// 이때 A를 보조 기둥으로 활용합니다.
		Hanoi(N - 1, mid, start, to);
	}
}