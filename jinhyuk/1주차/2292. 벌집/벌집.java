import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int range = 1;
        int distance = 1;

        for (int i = 1; range < N; i++){
            range = range + (6 * i);
            distance++;

        }
        System.out.println(distance);

}
}