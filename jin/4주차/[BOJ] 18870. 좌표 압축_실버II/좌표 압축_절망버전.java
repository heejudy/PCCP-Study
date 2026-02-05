package spare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        // 1. 중복 제거
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(arr));

        // 2. 정렬
        // 자바 11에서는 지원하지 않음
        // List<String> list = set.stream().sorted().toList();
        List<String> list = set.stream().sorted().collect(Collectors.toList());

        // 3. 출력
        for (int i = 0; i < arr.length; i++){
            // indexOf는 시간 복잡도가 O(N^2)으로 시간초과가 발생함
            // indexOf - 완전 탐색
            System.out.print(list.indexOf(arr[i]));
            if(i < arr.length - 1){
                System.out.print(" ");
            }
        }
    }
}
