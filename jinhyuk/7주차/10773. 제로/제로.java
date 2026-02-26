import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int[] stk = new int[t];
        int ptr = 0;

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num != 0) {
                stk[ptr++] = num;
            } else {
                stk[--ptr] = 0;
            }
        }

        int sum = 0;
        for (int i : stk){
            sum += i;
        }

        System.out.println(sum);


    }

}
