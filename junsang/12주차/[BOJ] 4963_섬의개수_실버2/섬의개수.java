import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_4963 {
	static int w; // 너비 - 가로
	static int h; // 높이 - 세로
	static int M[][];

	// 8방향 탐색을 위한 방향 설정
	static int dirX[] = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int dirY[] = {-1, 0, 1, 1, -1, -1, 0, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0) return;

			M = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					M[i][j] = sc.nextInt();
				}
			}

			int count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (M[i][j] == 1) {
						count++;
						BFS(i, j);
					}
				}
			}
			System.out.println(count);
		}
	}
	private static void BFS(int i, int j) {
		Queue<Position> queue = new LinkedList<>();
		queue.offer(new Position(j, i)); // j가 가로(x), i가 세로(y)
		while (!queue.isEmpty()){
			Position now = queue.poll();
			int X = now.x;
			int Y = now.y;

			for (int k = 0; k < 8; k++) {
				int tempX = X + dirX[k];
				int tempY = Y + dirY[k];

				// 지도를 벗어나지 않았는지 확인
				if(tempX >= 0 && tempX < w && tempY >=0 && tempY < h && M[tempY][tempX]==1){
					queue.offer(new Position(tempX, tempY));
					M[tempY][tempX] = 0;
				}
			}

		}
	}
}

class Position{
	int x;
	int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
