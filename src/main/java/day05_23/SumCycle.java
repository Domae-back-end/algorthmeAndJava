package day05_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class SumCycle {
        //https://www.acmicpc.net/problem/1110
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String input = reader.readLine();
            String copy_input = input;

            if (input.equals("0")) {
                System.out.println("1");
                return;
            }
            int cnt = 0;

            if (copy_input.length() == 1) {
                copy_input = copy_input + copy_input;
                input = "0" + input;
                cnt++;
            }
            while (true) {
                int a = Integer.parseInt(copy_input.split("")[0]);
                int b = Integer.parseInt(copy_input.split("")[1]);
                int c = a + b;
                if (("" + c).length() >= 2) {
                    //2의자리
                    if (b == 0) {
                        copy_input = (("" + c).substring(1));
                    } else {
                        copy_input = b + "" + (("" + c).substring(1));
                    }

                } else {
                    //1의자리
                    copy_input = b + "" + c;
                }
                cnt++;
                if (copy_input.equals(input)) {
                    break;
                }
            }
            System.out.println(cnt);

        }

    }
