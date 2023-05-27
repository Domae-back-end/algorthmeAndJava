package day05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoinAvg {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(reader.readLine());
            arrayList.add(A);
        }

        int cnt = 0;

        //5
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if(K >= arrayList.get(i)){
                cnt += K / arrayList.get(i);
                K -= K / arrayList.get(i) * arrayList.get(i);
            }
        }

        System.out.println(cnt);


    }

}
