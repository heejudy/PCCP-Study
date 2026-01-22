import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_28278 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder str = new StringBuilder();

		// N: 명령어 개수
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int n = 0; n < N; n++){
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());

			switch (M) {
				case 1:
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					if (stack.isEmpty())
						str.append(-1).append("\n");
					else
						str.append(stack.pop()).append("\n");
					break;
				case 3:
					str.append(stack.size()).append("\n");
					break;
				case 4:
					if (stack.isEmpty())
						str.append(1).append("\n");
					else
						str.append(0).append("\n");
					break;
				case 5:
					if (stack.isEmpty())
						str.append(-1).append("\n");
					else
						str.append(stack.peek()).append("\n");
					break;
			}
		}
		System.out.print(str);
	}
}