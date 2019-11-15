public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(-222);
    }

    public static void numberToWords(int number) {
        StringBuilder numString = new StringBuilder();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            //count original number
            int digitNumber = getDigitCount(number);
            number = reverse(number);

            //count reversed number
            int reverseNumber = getDigitCount(number);

            int lastDigit = 0;
            while (number > 0) {
                lastDigit = number % 10;
                switch (lastDigit) {
                    case 0:
                        numString.append("Zero ");
                        break;
                    case 1:
                        numString.append("One ");
                        break;
                    case 2:
                        numString.append("Two ");
                        break;
                    case 3:
                        numString.append("Three ");
                        break;
                    case 4:
                        numString.append("Four ");
                        break;
                    case 5:
                        numString.append("Five ");
                        break;
                    case 6:
                        numString.append("Six ");
                        break;
                    case 7:
                        numString.append("Seven ");
                        break;
                    case 8:
                        numString.append("Eight ");
                        break;
                    case 9:
                        numString.append("Nine ");
                        break;
                }
                number = number / 10;
            }

            while (digitNumber != reverseNumber) {
                numString.append("Zero ");
                reverseNumber++;
            }

            System.out.println(numString);
        }
    }

    public static int reverse(int number) {
        int initial_number = number;
        number = Math.abs(number);
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed *= 10;
            reversed += lastDigit;
            number /= 10;
        }
        if (initial_number < 0) {
            System.out.println("-" + reversed);
            return -reversed;
        } else return reversed;
    }


    public static int getDigitCount(int number) {
        int count = 0;

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            count = 1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
