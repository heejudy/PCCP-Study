import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fac(n));

    }

    static int fac(int x){
        if (x <= 4){
            return 0;
        } else {
            return x/5 + fac(x/5);
        }

    }


}
