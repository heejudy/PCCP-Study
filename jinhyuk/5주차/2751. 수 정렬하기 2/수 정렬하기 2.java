import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <n; i++){
            set.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort((s1,s2)->{
            return s1-s2;
        });

        StringBuilder sb = new StringBuilder();
        for (int a : list){
            sb.append(a).append("\n");
        }
        System.out.println(sb);






    }

}
