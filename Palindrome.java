public class Palindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12321;
        boolean result = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }
    
}
