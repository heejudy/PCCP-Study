import java.util.Scanner;

public class BOJ_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] ch = new char[5][15];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 15; j++) {
				ch[i][j] = ' ';
			}
		}
		for (int i = 0; i < ch.length; i++) {
			char text[] = sc.nextLine().toCharArray();
			for (int j = 0; j < text.length; j++) {
				ch[i][j] = text[j];
			}
		}
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if(ch[i][j] != ' '){
					System.out.print(ch[i][j]);
				}
			}
		}
	}
}
