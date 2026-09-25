public class Print_EvenNumber {
    public static void main(String[] args) {
        System.out.println("Even numbers from 25 to any 99 are:");
        for (int i = 25; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}