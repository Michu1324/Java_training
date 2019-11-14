public class FirstAndLastDigitSum {
    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else if (number > 0 && number <= 9) {
            return number + number;
        } else {
            int last = number % 10;
            int first = 0;
            while (number > 0) {
                number = number / 10;
                if (number > 0 && number <= 9) {
                    first = number;
                }
            }
            return first + last;
        }
    }
}