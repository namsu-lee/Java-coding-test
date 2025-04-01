package Chapter_03_Array;

import java.io.*;
import java.util.*;

public class baekjoon_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        String[] line = br.readLine().split(" ");

        int[] scores = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();

        int max = Integer.MIN_VALUE;

        for(int score : scores){
            max = Math.max(score, max);
        }
        
        double total = 0;
        for(int score : scores){
            total += (double) score / max * 100;
        }
        System.out.println((double)total / number);
    }
}
