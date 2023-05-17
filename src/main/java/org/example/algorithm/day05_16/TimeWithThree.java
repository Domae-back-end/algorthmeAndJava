package org.example.algorithm.day05_16;

public class TimeWithThree {

    /**
     * ## 시각
     *
     * 정수 N 이 입력되면 00시 00분 00초부터 N 시 59분 59초까지의 모든
     * 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을
     * 작성하시오.
     *
     * 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로
     * 세어야 하는 시각이다.
     * - 00시 00분 03초
     * - 00시 13분 30초
     *
     * 반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안되는 시각이다.
     * - 00시 02분 55초
     * - 01시 27분 45초
     *
     * ## 입력 조건
     * - 첫째 줄에 정수 N 이 입력된다. (0 <= N <= 23)
     *
     * ## 출력 조건
     * - 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도
     * 포함되는 모든 경우의 수를 출력한다.
     *
     * ## 입력 예시
     * 5
     *
     * ## 출력 예시
     * 11475
     *
     *
     * 완전 탐색 유형으로 분류되기도 하는 문제
     * 일반적으로 알고리즘 문제를 풀 때는 확인(탐색)해야 할 전체 데이터의 개수가
     * 100만 개 이하일 때 완전 탐색을 사용하면 적절하다
     */

    public static void main(String[] args) {

        int n = 5;
        int total = 0;

        for (int hours = 0; hours <= n; hours++){
            for (int min = 0; min < 60; min++){
                for (int sec = 0; sec < 60; sec++){
                    if((""+sec+min+hours).contains("3")){
                        System.out.println(hours+"시 "+min+"분 "+sec+"초");
                        total++;
                    }
                }
            }
        }
        System.out.println(total);


    }

}
