package Chapter_03_Array;

import java.io.*;
import java.util.*;

public class baekjoon_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> counter = new HashSet<>();

        String line;

        while((line = br.readLine()) != null){
            Integer input = Integer.parseInt(line);
            counter.add(input % 42);
        }
        System.out.println(counter.size());
    }
}
