public class NumberPalindrome {
    public static void main(String[] args) {
        isPallindrome(-1221);
    }

    public static boolean isPallindrome(int number) {
        int reverse = 0;
        number = Math.abs(number);
        int num = number;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }
        System.out.println("num== " + num + " && reverse== " + reverse);
        return num == reverse;
    }
}

