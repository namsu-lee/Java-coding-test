import java.io.*;

public class baekjoon_2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = new StringBuffer(numbers[i]).reverse().toString();
        }

        int max = Math.max(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));

        System.out.println(max);
    }
}
