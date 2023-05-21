package day05_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseArr {

    /**
     * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
     */

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(new ReverseArr().solution(a)));
    }

    public int[] solution(int[] num_list) {
        ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(arr);
        return arr.stream()
                .mapToInt(i -> i)
                .toArray();
    }

}
