import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		HashMap<Integer, Integer> rankingMap = new HashMap<>();

		int N = Integer.parseInt(br.readLine());

		int[] origin = new int[N];
		int[] sort = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i< N; i++){
			sort[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sort);

		int rank = 0;
		for(int value : sort){
			if(!rankingMap.containsKey(value)) {
				rankingMap.put(value, rank);
				rank++;
			}
		}

		for(int key : origin) {
			int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(ranking).append(' ');
		}

		System.out.println(sb);
	}
}