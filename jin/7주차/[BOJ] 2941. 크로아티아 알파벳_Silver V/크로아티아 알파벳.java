import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        String replace;

        replace = target.replaceAll("c=", "!");
        replace = replace.replaceAll("c-", "!");
        replace = replace.replaceAll("dz=", "!");
        replace = replace.replaceAll("d-", "!");
        replace = replace.replaceAll("lj", "!");
        replace = replace.replaceAll("nj", "!");
        replace = replace.replaceAll("s=", "!");
        replace = replace.replaceAll("z=", "!");

        System.out.println(replace.length());
    }
}