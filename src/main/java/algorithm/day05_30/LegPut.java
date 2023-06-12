package algorithm.day05_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class LegPut {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(reader.readLine());

        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            long N = Long.parseLong(st.nextToken());
            long M = Long.parseLong(st.nextToken());

            BigInteger buf_n = new BigInteger("1");
            for (int j = 1; j <= N; j++) {
                buf_n = buf_n.multiply(BigInteger.valueOf(j));
            }
            BigInteger buf_m = new BigInteger("1");
            for (int j = 1; j < N; j++) {
                buf_m = buf_m.multiply(BigInteger.valueOf(M-j));
            }
            buf_m = buf_m.multiply(BigInteger.valueOf(M));
            sb.append(buf_m.divide(buf_n)).append("\n");
            //422590010274432000
        }
        System.out.println(sb);

    }
}
