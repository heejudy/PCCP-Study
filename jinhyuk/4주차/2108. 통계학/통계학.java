import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[8001]; 
        
        double sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i] + 4000]++;
        }
        
        System.out.println(Math.round(sum / N));
        
        Arrays.sort(arr);
        System.out.println(arr[N / 2]);
        
        int maxCount = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
            }
        }
        
        ArrayList<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (count[i] == maxCount) {
                modeList.add(i - 4000);
            }
        }
        
        if (modeList.size() > 1) {
            Collections.sort(modeList);
            System.out.println(modeList.get(1)); 
        } else {
            System.out.println(modeList.get(0));
        }
        
        System.out.println(arr[N - 1] - arr[0]);
    }
}