package Chapter_03_Array;

import java.util.*;
import java.io.*;

public class baekjoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        String line = br.readLine();
        int[] numbers = Arrays.stream(line.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }    
}
