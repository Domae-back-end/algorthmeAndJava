package algorithm.day05_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
0 ~ 10
10

1  1     1 1번 1
1  1     2 2번 1
1  1 1   3 3번 1

1 2  1       4 3번 2     1
1 2  1 1     5 4번 2     2
1 2  2 1     6 4번 2     3
1 2  2 1 1   7 5번 2     4
1 2  2 2 1   8 5번 2     5

1 2 3  2 1       9  5번 3    3
1 2 3  2 1 1     10 6번 3    4
1 2 3  2 2 1     11 6번 3    5
1 2 3  3 2 1     12 6번 3    6
1 2 3  3 2 1 1   13 7번 3    7
1 2 3  3 2 2 1   14 7번 3    8
1 2 3  3 3 2 1   15 7번 3    9

1 2 3 4  3 2 1       16 7번 4    6
1 2 3 4  3 2 1 1     17 8번 4    7

1 2 3 4 5 4 3 2 1    25 9번 5    9


1 2  1               4  3번 2    1
1 2 3  2 1           9  5번 3    3
1 2 3 4  3 2 1       16 7번 4    6
1 2 3 4 5 4 3 2 1    25 9번 5    9

*/

public class Main {
    //https://www.acmicpc.net/problem/1011
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(reader.readLine());

        for(int i = 0; i < testNumber; i++){
            String input = reader.readLine();
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

        }

    }

}
