package day05_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> items = new HashMap<>();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        ArrayList<Integer> key_list = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            int item_w = Integer.parseInt(st.nextToken());
            int item_v = Integer.parseInt(st.nextToken());
            key_list.add(item_w);
            items.put(item_w, item_v);
        }
        Collections.sort(key_list);

        //정렬 후

        int tot_w = 0;
        int tot_v = 0;

        int w_mx = 0;
        int v_mx = 0;

        /**
         * 총 무게 : 7
         * key  value
         * 3    6
         * 4    8
         * 5    12
         * 6    13
         */

        for (int key : key_list) {
            tot_w += key; //현재 무게

            if (K > tot_w) { //
                tot_v += items.get(key);
            }
            else if(K == tot_w){
                tot_v += items.get(key);

                if(tot_v > v_mx){
                    v_mx = tot_v;
                }
            }
            else{

            }
            
            if(items.get(key) > value_mx){
                value_mx = items.get(key);
            }

        }
        System.out.println();

    }
}
