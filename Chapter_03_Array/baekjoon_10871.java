package Chapter_03_Array;

import java.util.*;
import java.io.*;

public class baekjoon_10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");

        int target = Integer.parseInt(line1[1]);
        int[] numbers = Arrays.stream(line2).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> smallerInt = new ArrayList<>();

        for(int number : numbers){
            if(number < target) smallerInt.add(number);
        }

        for(Integer number : smallerInt){
            System.out.print(number + " ");
        }
    }
}
