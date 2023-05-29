package day05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Atm {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> PQ = new PriorityQueue();
        reader.readLine();

        String[] input = reader.readLine().split(" ");

        for (String a : input) {
            PQ.add(Integer.parseInt(a));
        }
        //PQ.poll() 작은거부터
        int min = 0;
        int cnt = 0;
        int size = PQ.size();
        for (int i = 0; i < size; i++) {
            min += PQ.poll();
            cnt += min;
        }

        System.out.println(cnt);

    }
}
