package nengboonchai.quiz;

public class StingPalindromeCheck {
    public static void main(String[] args) {
        String str = "masdam";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome);
    }

    private static boolean checkPalindrome(String str) {
            int length = str.length();
            //if (length % 2 == 0) {
                int centerIndex = str.length() / 2;
                for (int i = 0; i < centerIndex; i++) {
                    if (str.charAt(i ) != str.charAt(length -1- i)) {
                        return false;
                    }
                }
                return true;
    }
}
