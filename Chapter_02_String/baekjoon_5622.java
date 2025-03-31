import java.io.*;

public class baekjoon_5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        int counter = 0;

        for(String alphabet : str){
            switch(alphabet){
                case "A": case "B": case "C": counter += 2 + 1; break;
                case "D": case "E": case "F": counter += 3 + 1; break;
                case "G": case "H": case "I": counter += 4 + 1; break;
                case "J": case "K": case "L": counter += 5 + 1; break;
                case "M": case "N": case "O": counter += 6 + 1; break;
                case "P": case "Q": case "R": case "S": counter += 7 + 1; break;
                case "T": case "U": case "V": counter += 8 + 1; break;
                case "W": case "X": case "Y": case "Z": counter += 9 + 1; break;
            }
        }
        System.out.println(counter);
    }
}
