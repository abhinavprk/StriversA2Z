package abhi.practice.recursion;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Abhinav", 0, 6));
        System.out.println(isPalindrome("12344321", 0, 7));
        System.out.println(isPalindrome("1234321", 0, 6));
        System.out.println(isPalindrome("1111111", 0, 6));
        System.out.println(isPalindrome("sirrahdeliverdeifieddessertsdetartratedstresseddeifiedreviledharris", 0, "sirrahdeliverdeifieddessertsdetartratedstresseddeifiedreviledharris".length()-1));
    }

    private static boolean isPalindrome(String string, int left, int right){
        if(left > right){
            return true;
        }
        if(string.charAt(left) != string.charAt(right)){
            return false;
        } else {
            return isPalindrome(string, ++left, --right);
        }
    }
}
