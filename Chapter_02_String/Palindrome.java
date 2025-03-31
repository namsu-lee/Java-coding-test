public class Palindrome {
    public static void main(String[] args){
        String original = "A man, a plan, a canal - Panama!";

        // 대소문자 구분 X, 문장부호 무시
        StringBuilder reverse1 = new StringBuilder(original.toLowerCase().replaceAll("[^a-z]", "")).reverse();

        // 대소문자 구분 O, 문장부호 체크
        StringBuilder reverse2 = new StringBuilder(original).reverse();

        System.out.println(original.toLowerCase().replaceAll("[^a-z]", "").equals(reverse1.toString())); // true
        System.out.println(original.equals(reverse2.toString())); // false
        
    }
}
