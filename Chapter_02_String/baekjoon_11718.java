import java.io.*;

public class baekjoon_11718{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine()) != null){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }
}