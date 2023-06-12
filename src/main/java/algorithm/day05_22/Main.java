package algorithm.day05_22;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    //https://www.acmicpc.net/problem/2869
    public static void main(String[] args) throws IOException {

        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(input, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int c = V - B;
        if (c % (A - B) == 0) {
            bw.write("" + (c / (A - B)));
        } else {
            bw.write("" + ((c / (A - B))+1));
        }

        bw.newLine(); //줄바꿈
        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close();//스트림을 닫음
    }

}
