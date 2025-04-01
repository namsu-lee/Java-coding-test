package Chapter_03_Array;

import java.util.*;
import java.io.*;

public class baekjoon_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        String line;

        while((line = br.readLine()) != null){
            numbers.add(Integer.parseInt(line));
        }


        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < numbers.size(); i++){
            if(max < numbers.get(i)){
                max = numbers.get(i);
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
