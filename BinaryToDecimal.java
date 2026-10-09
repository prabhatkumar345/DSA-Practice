public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1011001;
        int decimal = 0;
        while(binary > 0){
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit * (int)Math.pow(2, 0);
            binary = binary / 10;
        }
        System.out.println("Decimal representation: " + decimal);
    }
    
}
