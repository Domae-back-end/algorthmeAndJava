package algorithm.day05_21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mode {
    /**
     * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
     * 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
     */

    public static void main(String[] args) {

        int[] n = {0,1,2,3,4,5};

        System.out.println(new Mode().solution(n));
    }
    public int solution(int[] array) {
        HashMap<Integer,Integer> ar = new HashMap<>();
        ArrayList<int[]> arrlist = new ArrayList<>();

        boolean check = true;

        for(int i = 1; i < array.length; i++){
            if(array[0] != array[i]){
                check = false;
            }
        }

        if(check){
            return array[0];
        }



        for (int i = 0; i < array.length; i++){
            if(ar.get(array[i]) != null){
                ar.put(array[i],ar.get(array[i])+1);
            }else{
                ar.put(array[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : ar.entrySet() ){
            int[] buf = new int[entry.getValue()];
            for(int i = 0; i< buf.length; i++){
                buf[i] = entry.getKey();
            }
            arrlist.add(buf);
        }

        int[] test = arrlist.get(0);

        for(int i = 1; i < arrlist.size(); i++){
            if(arrlist.get(i).length > test.length){
                test = arrlist.get(i);
                arrlist.set(i, new int[0]);
            }
        }

        for(int i =0; i < arrlist.size(); i++){
            if(test.length == arrlist.get(i).length){
                return -1;
            }
        }
        return test[0];

    }

}
