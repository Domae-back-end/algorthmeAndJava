package day05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class YackSu {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        //2
        //4 2

        String s = reader.readLine(); //4 2 int[] -> arraylist.add(4), arraylist.add(2)
        if(s.length() == 1){
            System.out.println(Integer.parseInt(s) * Integer.parseInt(s) );
            return;
        }
        String[] str = s.split(" "); //4,2

        ArrayList<Integer> list = new ArrayList<>();

        for (String st : str) { //st = 4    st = 2
            list.add(Integer.parseInt(st));
        }

        Collections.sort(list);

        System.out.println(list.get(0) * list.get(list.size()-1));


    }
}
