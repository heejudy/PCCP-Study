import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

// 이 번 문제의 경우 우리가 고려해야 할 점은 '중복 원소의 개수'를 알아내는 것이다
public class BOJ_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 *  HashMap은 Key, Value의 쌍으로 저장하는 Map 인터페이스의 구현체입니다.
		 *  리스트처럼 순서로 접근하지 않고, key의 hashCode() 값을 이용해
		 *  저장 위치를 계산하여 값에 바로 접근하는 구조입니다.
		 *  Key = 입력되는 원소
		 *  Value = 원소의 개수(=중복 입력 된 원소의 수)
		 */
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(br.readLine()); // N = 10

		for(int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken()); // 6 3 2 10 10 10 -10 -10 7 3
			/*
			 * getOrDefault(key, defaultValue)
			 * (key, (key가 Map에 존재하면 해당 value를 반환 없으면 0 반환) + 1 )
			 */
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine()); // M = 8

		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken()); // 10 9 -5 2 3 4 5 -10

			// key값에 저장되어있는 value 값을 가져와 StringBuilder에 추가
			sb.append(map.getOrDefault(key, 0)).append(' ');
		}
		System.out.println(sb);
	}
}