package day05_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AroundQue {
    //짝수 기준점이 2
    //
    //홀수 기준점이 1
    // input > index(num/2)
    // 중앙값이 걸렸을때
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token1 = new StringTokenizer(reader.readLine());
        LinkedList<Integer> dq = new LinkedList<>();

        int numLength = Integer.parseInt(token1.nextToken());
        int pickCnt = Integer.parseInt(token1.nextToken());
        StringTokenizer token2 = new StringTokenizer(reader.readLine());

        //1 2 3 4 5 6 7 8 9 10

        //input : 1
        //2 3 4 5 6 7 8 9 10

        //input : 2
        //3 4 5 6 7 8 9 10

        //input : 3
        //4 5 6 7 8 9 10

        //que 추가하는문.
        for (int i = 1; i <= numLength; i++) {
            dq.add(i);
        }

        int cnt = 0;
        int midIndex;
        for (int i = 0; i < pickCnt; i++) {
            int num = Integer.parseInt(token2.nextToken());
            int numIndex = dq.indexOf(num);
            // numLength 가 짝수개인지 홀수개 인지,
            // 짝수
            // 1 2 3 4
            if (dq.size() % 2 == 0) {
                midIndex = (dq.size() / 2) - 1;

//                10 10
//                1 6 3 2 7 9 8 4 10 5
//                14


            }else{
                // 홀수
                //  1 2 3 4 5 6 7 8 9
                //  9 1 2 3 4 5 6 7 8   1
                //  8 9 1 2 3 4 5 6 7   2
                //  7 8 9 1 2 3 4 5 6   3
                //  7 8 9 1 2 3 4 5   4
                midIndex = dq.size() / 2;
            }
            //왼쪽
            if(midIndex >= numIndex){
                for (int j = 0; j < numIndex; j++) {
                    dq.offerLast(dq.pollFirst());
                    cnt++;
                }
            }
            //오른쪽
            else{
                for (int j = dq.size(); j > numIndex; j--) {
                    dq.offerFirst(dq.pollLast());
                    cnt++;
                }
            }
            dq.pollFirst();

        }

        System.out.println(cnt);

    }

}