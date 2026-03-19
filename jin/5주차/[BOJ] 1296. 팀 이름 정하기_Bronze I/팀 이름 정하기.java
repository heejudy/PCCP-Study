import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String yeonName = br.readLine();
        
        int n = Integer.parseInt(br.readLine());
        String[] teamNames = new String[n];
        for (int i = 0; i < n; i++) {
            teamNames[i] = br.readLine();
        }
        
        Arrays.sort(teamNames);
        
        int maxProb = -1;
        String bestTeam = "";
        
        for (String team : teamNames) {
            int L = countChar(yeonName, 'L') + countChar(team, 'L');
            int O = countChar(yeonName, 'O') + countChar(team, 'O');
            int V = countChar(yeonName, 'V') + countChar(team, 'V');
            int E = countChar(yeonName, 'E') + countChar(team, 'E');
            
            int prob = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
            
            if (prob > maxProb) {
                maxProb = prob;
                bestTeam = team;
            }
        }
        
        System.out.println(bestTeam);
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}