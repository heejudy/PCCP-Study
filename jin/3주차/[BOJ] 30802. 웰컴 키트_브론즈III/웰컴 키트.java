import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 참가자 수
        int N = Integer.parseInt(br.readLine());

        // 사이즈 배열
        int[] size = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        // 묶음 수 가져오기
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // T묶음 갯수 계산
        int T_cnt = 0;
        for(int i : size){
            if(i % T != 0){
                T_cnt += ((i / T) + 1);
            }else{
                T_cnt += (i / T);
            }
        }

        // P자루 묶음 수 계산
        int P_cnt = N / P;
        int cnt = N % P;

        System.out.println(T_cnt);
        System.out.println(P_cnt + " " + cnt);
    }
}