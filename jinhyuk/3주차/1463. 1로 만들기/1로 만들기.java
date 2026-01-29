import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] x = new int[n+1]; // 배열인덱스 자체를 숫자로 사용함
        
        x[0] = 0; // 어처피 안쓴다.
        x[1] = 0; // 1은 어처피 1이 되었으니 0임
        
        for (int i = 2; i <= n; i++){
            
            x[i] = x[i-1] +1;
            
            if (i % 2 == 0){
                x[i] = Math.min(x[i], x[i / 2]+1);
            }
            if (i % 3 == 0){
                x[i] = Math.min(x[i], x[i / 3]+1);
            }
        }

        System.out.println(x[n]);
        


    }
}


