import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m ; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        for (int i = 0; i < m ; i++) {
            int result = binSearch(a, n, b[i]);
            System.out.println(result);


        }


    }

    public static int binSearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;
        while(pl <= pr){
            int pc = (pl + pr) / 2;
            if(a[pc] == key){
                return 1;
            }
            else if(a[pc] < key){
                pl = pc +1;
            } else{
                pr = pc -1;
            }

        }
        return 0;
    }
}
