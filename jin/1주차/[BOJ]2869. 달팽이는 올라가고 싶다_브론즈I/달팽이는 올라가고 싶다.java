import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int n = a - b;
        int res = (v-a)/n + 1;
        if ((v-a) % n != 0) res ++;
        System.out.println(res);
    }
}