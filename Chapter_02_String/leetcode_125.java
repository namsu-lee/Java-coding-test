class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder original = new StringBuilder(s.toLowerCase()
        .replaceAll("[^a-z0-9]", ""));
        StringBuilder reverse = new StringBuilder(original).reverse();

        return original.toString().equals(reverse.toString());
    }
}