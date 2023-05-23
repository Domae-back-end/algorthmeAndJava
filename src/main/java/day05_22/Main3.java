package day05_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    //https://www.acmicpc.net/problem/4948


    public static void main(String[] args) throws IOException {

        int range = 123456;

        boolean[] number = new boolean[(range*2)+1];

        number[0] = true;
        number[1] = true;

        for(int i = 2; i <= (range*2) + 1; i ++){
            number[i] = true;
            if(!number[i]){
                for(int j = i*i ; j < (range*2) + 1; j+=i){
                    number[j] = false;
                }
            }
        }

        while (true){

            int input = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if(input == 0){
                break;
            }
            int cnt = 0;

            for(int i = input; i <= input*2; i ++){
                if (number[i]) {
                    cnt++;
                }
            }

            if(cnt == 0){
                cnt++;
            }

            System.out.println(cnt);
        }

    }

}
