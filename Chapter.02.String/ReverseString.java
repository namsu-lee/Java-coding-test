import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        String str = "ABCDE";
        
        // 1. StringBuilder 사용
        StringBuilder reverse1 = new StringBuilder(str).reverse();

        System.out.println(reverse1); // EDCBA

        // 2. Char 배열 사용
        char[] reverse2 = str.toCharArray();

        // 배열 길이의 절반만 순회해야 한다. 배열 길이 모두를 순회하면 중복해서 바꾼다.
        for(int i = 0; i < reverse2.length / 2; i++){
            char temp = reverse2[i];
            reverse2[i] = reverse2[reverse2.length - 1 - i];
            reverse2[reverse2.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(reverse2)); // [E, D, C, B, A]
        
    }    
}
