public class EvenOrNot {
    public static boolean isEvenOrOdd(int number) {
            return number % 2 == 0;
    }
    public static void main(String[] args) {
        int number = 407;
        boolean result = isEvenOrOdd(number);
        System.out.println("Is " + number + " even? " + result);
    }
    
}
