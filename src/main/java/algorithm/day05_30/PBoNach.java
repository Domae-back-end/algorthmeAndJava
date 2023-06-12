package algorithm.day05_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PBoNach {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] d = new int[45][2];

        int T = Integer.parseInt(reader.readLine());

        d[0][0] = 1;
        d[0][1] = 0;

        d[1][0] = 0;
        d[1][1] = 1;


        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());

            for (int j = 2; j <= N; j++) {
                d[j][0] = d[j - 1][0] + d[j - 2][0];
                d[j][1] = d[j - 1][1] + d[j - 2][1];
            }
            System.out.println(d[N][0] + " " + d[N][1]);

        }
    }
}
