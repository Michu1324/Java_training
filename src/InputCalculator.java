import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        long avg = 0L;
        int sum = 0;
        int counter = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                counter += 1;
                avg = Math.round((double) sum / (double) counter);

            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                scanner.close();
                break;
            }
        }
    }
}
