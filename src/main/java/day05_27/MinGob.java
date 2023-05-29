package day05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinGob {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            String[] tot = reader.readLine().split(" ");
            int a1 = Integer.parseInt(tot[0]);
            int a2 = Integer.parseInt(tot[1]);

            int big = a2;
            int sm = a1;

            if (a1 > a2) {
                big = a1;
                sm = a2;
            }

            int mul = 1; //곱하는수

            while ((big * mul) % sm != 0) {
                mul++;
            }
            System.out.println(big * mul);

        }

    }
}
