import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int layer = 1;
        int range_max = 1;
        while(range_max < n){
            range_max += 6 * layer;
            layer++;
        }
        System.out.println(layer);
    }
}
