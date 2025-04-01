package Chapter_03_Array;

import java.io.*;

public class baekjoon_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] counter = new int[31];

        String line;

        while((line = br.readLine()) != null){
            int num = Integer.parseInt(line);
            counter[num]++;
        }

        for(int i = 1; i <= 30; i++){
            if(counter[i] == 0){
                System.out.println(i);
            }
        }
    }
}
