package algorithm.day05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());


        int cnt = 0;
        int num = 0;
        while (cnt != input) {
            num++;
            if (("" + num).contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);

    }


}
