import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        int[][] grid = new int[height][width];
        for (int i = 0; i < height; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < width; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < height; i++) {
            grid[i][0] = grid[i-1][0] + grid[i][0];
        }

        for (int j = 1; j < width; j++) {
            grid[0][j] = grid[0][j-1] + grid[0][j];
        }

        for(int i = 1; i < height; i++){
            for(int j = 1; j < width; j++){
                grid[i][j] = Math.max(grid[i][j-1], Math.max(grid[i-1][j], grid[i-1][j-1])) + grid[i][j];
            }
        }

        System.out.print(grid[height - 1][width - 1]);
    }
}

