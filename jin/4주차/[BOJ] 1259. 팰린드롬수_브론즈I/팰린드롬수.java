import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> stack = new ArrayDeque<>();

        while(true){
            String line = br.readLine();
            if(line == null || "0".equals(line)) break;
            
            int mid = line.length() / 2;
            int n = line.length() % 2;

            String before = line.substring(0, mid);
            String after = line.substring(mid + n);

            for(char c : before.toCharArray()){
                stack.push(c);
            }

            for(int i = 0; i < after.length(); i++){
                if(stack.peek() == after.charAt(i)){
                    stack.pop();
                }
            }

            if (stack.isEmpty()){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            stack.clear();

        }
    }
}