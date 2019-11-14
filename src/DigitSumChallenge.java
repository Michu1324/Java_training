public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(123456789);
    }

    public static int sumDigits(int number) {
//        int n = 0;
        int calcNumber = 0;
        if (number >= 10) {
            while (number > 0) {
                calcNumber += number % 10;
                number = number / 10;
            }
            System.out.println(calcNumber);
            return calcNumber;
        } else return -1;
    }
}