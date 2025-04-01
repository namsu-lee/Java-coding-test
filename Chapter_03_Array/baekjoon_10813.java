package Chapter_03_Array;

import java.io.*;

public class baekjoon_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int[] baskets = new int[Integer.parseInt(line.split(" ")[0])];

        for(int i = 0; i < baskets.length; i++){
            baskets[i] = i + 1;
        }

        while((line = br.readLine()) != null){
            String[] split = line.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            int temp = baskets[a - 1];
            baskets[a - 1] = baskets[b - 1];
            baskets[b - 1] = temp;
        }

        for(int basket : baskets){
            System.out.print(basket + " ");
        }
    }
}
