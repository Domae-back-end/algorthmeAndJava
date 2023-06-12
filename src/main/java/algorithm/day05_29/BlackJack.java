package algorithm.day05_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int index_size = Integer.parseInt(st.nextToken()); //카드의 개수
        int compare_number = Integer.parseInt(st.nextToken()); //정답 21
        int arr[]=  new int[index_size];
        //5 6 7 8 9
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 5 6 7 8 9
        }
        //5 6 7 8 9
        int mx=0;
        int sum ;
        for(int i =0; i <arr.length-2;i++){//6
            for(int j =i+1; j <arr.length-1; j++){
                for(int z=j+1; z < arr.length; z++){
                    sum = arr[i] + arr[j] + arr[z];
                    if(sum <=compare_number){
                        mx =Math.max(mx,sum);
                    }
                }
            }
        }
        System.out.println(mx);


    }
}
