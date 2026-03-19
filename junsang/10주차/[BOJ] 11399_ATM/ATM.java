import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] S = new int[N];
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		S[0] = arr[0]; // S 배열은 인덱스 1부터 시작하기 떄문에 arr배열의 0번 인덱스를 초기화 해준다.

		for (int i = 1; i < N; i++) {
			S[i] = S[i - 1] + arr[i];
		}

		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += S[i];
		}

		System.out.println(sum);
	}
}
