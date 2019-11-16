public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(6, 2, 17));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }

        int bigCountSum = bigCount * 5;
        int sum = 0;
        if (bigCountSum == 0) {
            for (int i = 1; i <= smallCount; i++) {
                sum += 1;
                if (sum == goal) {
                    return true;
                }
            }
        } else if (bigCountSum > 0) {
            for (int i = 1; i <= bigCount; i++) {
                sum += (5 * i);
                if (sum == goal) {
                    return true;
                } else if (sum > goal) {
                    return false;
                }
                for (int y = 1; y <= smallCount; y++) {
                    sum += 1;
                    if (sum == goal) {
//                        System.out.println(sum);
                        return true;
                    } else if (sum > goal) {
                        return false;
                    } else if (y == smallCount) {
                        sum = 0;
                    }
                }
            }
        }
        return false;
    }
}