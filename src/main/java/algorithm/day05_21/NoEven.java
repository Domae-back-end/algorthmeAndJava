package algorithm.day05_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class NoEven {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new NoEven().solution(10)));
    }
    public int[] solution(int n) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if(!(i % 2 == 0)){
                ar.add(i);
            }
        }
        Collections.sort(ar);

        return ar.stream().mapToInt(i -> i).toArray();
    }
}
