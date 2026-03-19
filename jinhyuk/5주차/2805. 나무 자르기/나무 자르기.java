import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());

        int[] a = new int[num];

        st = new StringTokenizer(br.readLine());
        for(int i  = 0; i < num; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        long low = 0;
        long high = a[0];

        for (int idx : a){
            if (high <= idx){
                high = idx;
            }
        }

        long result = 0;

        while (low <= high){

            long mid = (low + high) / 2;
            long sum = 0;

            for (int tree : a){
                if (tree > mid){
                    sum += (tree - mid);
                }
            }

            if (sum >= m){
                result = mid;
                low = mid +1;

            } else {

                high = mid -1;
            }

        }

        System.out.println(result);










    }
}
