package day05_21;

import java.math.BigInteger;
import java.util.Arrays;

public class FountainSum {

    /**
     * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
     * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new FountainSum().solution(9, 2, 1, 3)));
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int under = denom1 * denom2;
        int top = numer1 * (under / denom1) + numer2 * (under / denom2);

        BigInteger a1 = BigInteger.valueOf(under);
        BigInteger a2 = BigInteger.valueOf(top);
        int gcd = a1.gcd(a2).intValue(); //최대 공약수

        while(gcd != 1){
            top /= gcd;
            under /= gcd;
            a1 = BigInteger.valueOf(under);
            a2 = BigInteger.valueOf(top);
            gcd = a1.gcd(a2).intValue();
        }

        int[] answer = {top,under};
        return answer;
    }


}
