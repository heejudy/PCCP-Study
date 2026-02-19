import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String check = "";

        int num = 0;
        int cnt = 0;
        while(cnt < n){
            num ++;
            check = String.valueOf(num);
            if(check.contains("666")) cnt++;
        }
        System.out.println(check);
    }
}