package Chapter_03_Array;

import java.util.*;
import java.io.*;

public class baekjoon_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] line = br.readLine().split(" ");
        int[] numbers = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(br.readLine());

        int counter = 0;

        for(int number : numbers){
            if(number == target) counter++;
        }

        System.out.println(counter);
    }
}
