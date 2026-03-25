import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {

	static int N,M;
	static int[][] map;
	static boolean[][] check;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());  // 그림판 세로
		M = Integer.parseInt(st.nextToken());  // 그림판 가로

		map = new int[N][M]; // 그림의 입력을 받기위한 변수 선언
		check = new boolean[N][M]; // 방문 했는지 안했는지 왁인하기 위한 변수


		for (int i = 0; i < N; i++) { // 예제 입력을 받기 위한 for문
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int cnt=0; // 그림의 개수
		int max=0; // 그림의 넓이

		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] ==1 && !check[i][j]) { // 그림에 1이거나 방문하지 않았던 곳이면 탐색 시작
					max = Math.max(max, bfs(j,i));
					cnt++; // 하나의 bfs가 종료되면 그림의 개수를 세기 위한 증감식
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}

	static int bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		check[y][x] = true;
		int size=1;
		while(!q.isEmpty()) { // 큐가 비어있을 떄 까지 반복
			int[] p = q.poll();
			int px = p[0];
			int py = p[1];

			for(int d=0; d<4; d++) { // 상 하 좌 우 를 탐색하기위해

				int nx = px+dx[d]; // 다음 이동할 x 좌표
				int ny = py+dy[d]; // 다음 이동할 y 좌표

				if(nx<0 || ny<0 || nx>M-1 || ny>N-1) continue; // 그림판의 범위 밖인지 확인

				if(check[ny][nx]) continue; // 확인 했던 곳이면 넘김

				if(map[ny][nx] == 1) { // 연결 되어 있는 1인지 확인
					size++;  // 넓이 증가
					check[ny][nx] = true; // 방문 표시
					q.add(new int[] {nx,ny}); // 다음 탐색 위치 큐에 삽입
				}
			}
		}
		return size;
	}
}
