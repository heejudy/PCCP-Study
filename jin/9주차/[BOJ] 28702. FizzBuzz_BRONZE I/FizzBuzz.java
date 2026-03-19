import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];

        for (int i = 0; i < 3; i++) {
            input[i] = br.readLine();
            if(input[i].matches("\\d+")){
                int num = Integer.parseInt(input[i]);
                int target = num + (3 - i);
                if ((target % 3 == 0) && (target % 5 == 0)){
                    System.out.println("FizzBuzz");
                } else if(target % 3 == 0){
                    System.out.println("Fizz");
                } else if(target % 5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(target);
                }
                break;
            }
        }
    }
}