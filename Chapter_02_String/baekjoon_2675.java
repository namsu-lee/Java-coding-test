import java.io.*;

public class baekjoon_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        String str;

        while ((str = br.readLine()) != null) {
            int repeat = Integer.parseInt(str.split(" ")[0]);
            String[] target = str.split(" ")[1].split("");

            StringBuilder result = new StringBuilder();

            for (String element : target) {
                for (int i = 0; i < repeat; i++) {
                    result.append(element);
                }
            }

            System.out.println(result.toString());
        }
    }
}