package lab3;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int a) {
        if (a < 0)
            return false;
        String str = Integer.toString(a);
        return isPalindrome(str, 0, str.length() - 1);
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}
