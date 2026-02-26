import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) continue; 

            boolean isPrime = true;
            for (int j = 2; j < a; j++) {
                if (a % j == 0) { 
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}