import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			//한줄 입력을 한단어씩 쪼개서 배열에 저장
			String[] words = br.readLine().split(" ");

			for(int j=0;j<words.length;j++) {
				//저장한 words를 뒤집어 StringBuilder에 추가
				String temp = new StringBuilder(words[j]).reverse().toString();
				System.out.print(temp + " ");
			}
		}

	}
}
