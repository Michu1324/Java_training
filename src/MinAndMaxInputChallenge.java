import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min_number = 0;
        int max_number = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter a number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    min_number = number;
                    max_number = number;
                }

                if (number <= min_number) {
                    min_number = number;
                } else if (number >= max_number) {
                    max_number = number;
                }
            } else {
                System.out.println("Invalid value");
                break;
            }
        }
        System.out.println("Min: " + min_number);
        System.out.println("Max: " + max_number);

        scanner.close();
    }
}
