import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BOJ_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> str = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String text = br.readLine();
			if(!str.contains(text)){ // 중복 단어 체크
				str.add(text);
			}
		}
		Collections.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()){
					return o1.compareTo(o2); // 사전 순으로 정렬
				}

				//결과가 음수 (-) : o1가 더 작으면 앞에 정렬
				//결과가 양수 (+) : o2가 더 작으면 순서 바꿈
				return o1.length() - o2.length();
			}
		});

		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
		}
	}
}
