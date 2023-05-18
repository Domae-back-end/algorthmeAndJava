package org.example.algorithm.day05_16;

import java.util.Arrays;

public class Night_King {

    /**
     * 왕실의 나이트
     * 8 x 8 체스판으로 말은
     * 1. 수평으로 두칸 이동한 뒤에 수직으로 한칸 이동하기
     * 2. 수직으로 두칸 이동한 뒤에 수평으로 한칸 이동하기.
     *
     * 체스판으로 나갈수 없다.
     */

    public static void main(String[] args) {
        String xy = "c2";
        int x = switch (xy.split("")[0]) {
            case "a" -> 0;
            case "b" -> 1;
            case "c" -> 2;
            case "d" -> 3;
            case "e" -> 4;
            case "f" -> 5;
            case "g" -> 6;
            case "h" -> 7;
            default -> -1;
        };
        int y = Integer.parseInt(xy.split("")[1]) - 1;
        
        int[] b_x = {x - 2, x + 2, x + 2, x - 2, x + 1, x - 1, x + 1, x - 1};
        int[] b_y = {y - 1, y + 1, y - 1, y + 1, y + 2, y - 2, y - 2, y + 2};

        int cnt = 0;

        for (int j = 0; j < b_x.length; j++) {
            if (!(b_x[j] < 0 || b_y[j] < 0 || b_x[j] > 7 || b_y[j] > 7)) {
                cnt++;
            }
        }
        System.out.println(cnt);


    }


}
