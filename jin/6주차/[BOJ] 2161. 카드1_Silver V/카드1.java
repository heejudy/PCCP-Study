import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (queue.size() > 1) {
            sb.append(queue.poll()).append(" ");
            queue.add(queue.poll());
        }

        sb.append(queue.poll());

        System.out.println(sb.toString());
    }
}