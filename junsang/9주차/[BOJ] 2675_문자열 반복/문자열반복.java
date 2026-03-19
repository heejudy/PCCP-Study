import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;
		for(int i = 0; i < N; i++){
			st = new  StringTokenizer(br.readLine());

			int number = Integer.parseInt(st.nextToken());
			char[] ch = st.nextToken().toCharArray();

			for (int j = 0; j < ch.length; j++) {
				for (int k = 0; k < number; k++) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		}
	}
}
