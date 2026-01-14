package main.boj;

import java.io.*;

public class boj2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int distance = 1;

        for (int i = 1; count < N; i++) {
            count = count + (6 * i);
            distance++;
        }
        System.out.println(distance);

    }

}

//
//        int layer = 1; // 거리(결과값)
//        int range = 1; // 해당 층의 최대 숫자
//
//        // range가 N보다 작을 때까지만 반복
//        while (range < N) {
//            // 6, 12, 18... 순서대로 더해줌 (6 * layer)
//            range += 6 * layer;
//            layer++;
//        }
//
//        System.out.println(layer);
//    }
//}