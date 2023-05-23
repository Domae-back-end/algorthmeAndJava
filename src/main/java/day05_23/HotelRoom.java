package day05_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelRoom {
    //https://www.acmicpc.net/problem/10250
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++){
            String input = reader.readLine();
            int H = Integer.parseInt(input.split(" ")[0]);
            int N = Integer.parseInt(input.split(" ")[2]);

            int tot1 = N / H+1;
            int tot2 = N % H;

            if(tot2 == 0){
                tot2 = H;
                tot1--;
            }

            if((""+tot1).length() == 1){
                System.out.println(tot2+"0"+tot1);
            }else{
                System.out.println(tot2+""+tot1);
            }
        }

    }

}
