import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Point> points = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			points.add(new Point(sc.nextInt(), sc.nextInt()));
		}

		Collections.sort(points, (p1, p2) -> {
			if (p1.x == p2.x) {
				return p1.y - p2.y; // x가 같으면 y 기준으로 오름차순 정렬
			}
			return p1.x - p2.x;     // x 기준으로 오름차순 정렬
		});

		for (int i = 0; i < points.size(); i++) {
			Point now = points.get(i);
			System.out.println(now.x + " " + now.y);
		}
	}
}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}