package algorithm.day05_23;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;

    public class Sosu {
    //https://www.acmicpc.net/problem/1929
        public static boolean[] getPrime(){
            int num = 1000000;

            boolean[] arr = new boolean[num + 1];

            arr[1] = true;

            for (int i = 2; i < arr.length ; i++) {
                if(!arr[i]){
                    for (int j = i*2; j < arr.length ; j+=i) {
                        arr[j] = true;
                    }
                }
            }

            return arr;
        }

        public static void main(String[] args) throws IOException {

            boolean[] ar = getPrime();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String tot = reader.readLine();
            int start = Integer.parseInt(tot.split(" ")[0]);
            int end = Integer.parseInt(tot.split(" ")[1]);

            for (int i = start; i <= end ; i++) {
                if(!ar[i]) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                    bw.flush();
                }
            }
            bw.close();
        }
    }
