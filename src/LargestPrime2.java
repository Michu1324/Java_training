public class LargestPrime2 {
    public static void main(String[] args) {
//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(21));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int largestPrime = 0;
        int check = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                for (int y = 2; y < i; y++) {
                    if (i % y == 0) {
                        check += 1;
                    }
                }
                if (check == 0) {
                    largestPrime = i;
                }
            }
        }
        if (largestPrime == 0) {
            return number;
        } else return largestPrime;
    }
}
