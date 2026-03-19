import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int n; // 수열의 크기
        int x; // 두 요소의 합
        int[] arr; // 수열
        int cnt = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        // 배열에 수열 값 넣어주기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arr);

        // X 대입
        x = Integer.parseInt(br.readLine());

        int right = n - 1;
        int left = 0;
        while(right > left){
            if(arr[left] + arr[right] > x){
                right--;
            }else if(arr[left] + arr[right] < x){
                left++;
            }else{
                cnt++;
                left++;
            }
        }

        System.out.println(cnt);
    }
}