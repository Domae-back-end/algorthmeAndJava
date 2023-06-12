package algorithm.day05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MinHeep {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(reader.readLine());
        PriorityQueue PQ = new PriorityQueue();

        for (int i = 0; i < test; i++) {
            int number = Integer.parseInt(reader.readLine());
            if(number == 0){
                if(PQ.isEmpty()){
                    sb.append("0").append("\n");
                }else{

                    sb.append(PQ.poll()).append("\n");
                }
                continue;
            }
            PQ.add(number);
        }

        System.out.println(sb);
    }
}
