package algorithm.day05_24;import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for(int i=0; i<n; i++){
            String input =  reader.readLine();
            int x1, y1, r1;
            x1 = Integer.parseInt(input.split(" ")[0]);
            y1 = Integer.parseInt(input.split(" ")[1]);
            r1 = Integer.parseInt(input.split(" ")[2]);

            int x2, y2, r2;
            x2 = Integer.parseInt(input.split(" ")[3]);
            y2 = Integer.parseInt(input.split(" ")[4]);
            r2 = Integer.parseInt(input.split(" ")[5]);

            int dist = (int) (Math.pow((x1-x2),2) + Math.pow((y1-y2),2) );
            //  (sqrt ((x1-x2)^2 + (y1-y2)^2 ) )^2 == < > (r1+r2) ^2

            if( x1== x2 && y1==y2 && r1==r2){// 아예 겹침
                System.out.println("-1");
            }
            else if( Math.pow(r1+r2,2) < dist){ //아예 안겹침. //원 사이에 들어와있지 않음
                System.out.println(0);
            }

            else if(Math.pow(r1+r2,2) == dist){ // 원이 접할때 즉, 교점 1
                System.out.println(1);
            }
            else if(Math.pow(r1-r2,2) == dist){ //원이이 원 안에 있을 때 1
                System.out.println(1);
            }
            else if(Math.pow(r1-r2,2) > dist){ //원이 원안에 있지만 안겹칠때
                System.out.println(0);
            }
            else { //원이 두점에서 겹칠 때
                System.out.println(2);
            }


        }


    }

}



