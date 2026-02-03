<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();

		// Queue에 1~N까지 값을 offer한다.
		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}

		sb.append("<");
		// Queue의 사이즈가 1일 때까지 반복한다.
		while(q.size() != 1) {
			// k가 3일 떄 첫 번째, 두 번쨰 값은 삭제후 다시 추가
			for (int i = 0; i < K - 1; i++) {
				q.offer(q.poll());
			}
			// 3번째 값은 삭제 후 StringBuilder에 추가
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");

		// toString() 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		bw.write(sb.toString() + "\n");
		bw.flush();
	}
}






=======
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();

		// Queue에 1~N까지 값을 offer한다.
		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}

		sb.append("<");
		// Queue의 사이즈가 1일 때까지 반복한다.
		while(q.size() != 1) {
			// k가 3일 떄 첫 번째, 두 번쨰 값은 삭제후 다시 추가
			for (int i = 0; i < K - 1; i++) {
				q.offer(q.poll());
			}
			// 3번째 값은 삭제 후 StringBuilder에 추가
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");

		// toString() 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		bw.write(sb.toString() + "\n");
		bw.flush();
	}
}






>>>>>>> origin/main
