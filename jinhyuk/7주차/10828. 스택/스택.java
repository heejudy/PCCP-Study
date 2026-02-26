import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] stack = new int[t];
        int ptr = 0; // 스택용 포인터


        for (int i = 0; i < t; i++){
            String line = br.readLine();

            StringTokenizer st = new StringTokenizer(line);
            String cmd = st.nextToken();

            switch (cmd) {
                case "push" :
                    int x = Integer.parseInt(st.nextToken());
                    if (ptr <= t) stack[ptr++] = x;
                    break;

                case "pop" :
                    if (ptr <= 0) System.out.println("-1");
                    else System.out.println(stack[--ptr]);
                    break;

                case "size" :
                    System.out.println(ptr);
                    break;

                case "empty" :
                    if (ptr <= 0) System.out.println("1");
                    else System.out.println("0");
                    break;

                case "top" :
                    if (ptr <= 0) System.out.println("-1");
                    else System.out.println(stack[ptr-1]);
                    break;

            }
        }
    }
}
