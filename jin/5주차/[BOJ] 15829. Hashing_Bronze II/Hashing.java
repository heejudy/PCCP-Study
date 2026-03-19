import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long r = 1;
        int M = 1234567891;
        long sum = 0;

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();


        for (char ch : str.toCharArray()){
            sum += (ch - 'a' + 1) * r;
            r = (r * 31) % M;
        }

        System.out.println(sum % M);
    }
}