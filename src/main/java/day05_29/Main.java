package day05_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 1000000; i++) {

            String[] tot_arr = (""+i).split("");
            //198 + 1 + 9 + 8
            int tot=i; //43
            for (int j = 0; j < tot_arr.length; j++) {
                tot += Integer.parseInt(tot_arr[j]);
            }

            if(tot == input){
                System.out.println(i);
                return;
            }

        }
        System.out.println("0");


    }

}
