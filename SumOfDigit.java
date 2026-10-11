public class SumOfDigit {
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 5454;
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);
    }
    
}
