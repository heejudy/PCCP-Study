import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int tot = 0;

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            tot += a*b;
        }
        if(tot == x){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}