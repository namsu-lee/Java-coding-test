package Chapter_03_Array;

import java.io.*;
import java.util.*;


public class baekjoon_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int[] baskets = new int[Integer.parseInt(line.split(" ")[0])];

        while((line = br.readLine()) != null){
            String[] split = line.split(" ");
            int[] numbers = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

            int from = numbers[0];
            int to = numbers[1];
            int ball = numbers[2];

            for(int i = from; i <= to; i++){
                baskets[i - 1] = ball;
            }
        }

        for(int basket : baskets){
            System.out.print(basket + " ");
        }
    }
}
