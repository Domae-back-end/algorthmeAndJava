package day05_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {

        int input = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int cnt = 0;

        while(!(input <= 0)){
            if(input % 5 == 0){
                cnt += input / 5;
                input -= input / 5 * 5;
            }else{
                input -= 3;
                cnt++;
            }
        }

        if(input < 0){
            System.out.println("-1");
        }else{
            System.out.println(cnt);
        }

    }

}
