package algorithm.day05_21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
 * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
 */

public class CenterArray {

    public static void main(String[] args) {
        int[] ar = {9,-1,0};
        new CenterArray().solution(ar);
    }

    public int solution(int[] array) {
        List<Integer> arr = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(arr);
        return arr.get((arr.size() / 2));
    }

}
