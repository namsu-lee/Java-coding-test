import java.io.*;
import java.util.*;

public class baekjoon_10809 {
    public static void main(String[] args) throws IOException{
        Map<String, Integer> recoder = new LinkedHashMap<>();
        String[] list = "abcdefghijklmnopqrstuvwxyz".split("");
        for(String str : list){
            recoder.put(str, -1);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        for(String c : line.split("")){
            recoder.replace(c, -1, line.indexOf(c));
        }

        for(String key: recoder.keySet()){
            System.out.print(recoder.get(key) + " ");
        }
    }
}
