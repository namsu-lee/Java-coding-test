package Chapter_03_Array;

import java.util.*;
import java.io.*;

public class baekjoon_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        String[] line = br.readLine().split(" ");
        int[] numbers = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int number : numbers){
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        System.out.print(min + " " + max);
    }
}
