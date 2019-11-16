import java.util.ArrayList;
import java.util.List;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        List lista = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                lista.add(i);
            }
        }
        System.out.print("ArrayList: " + lista);
//        System.out.println("Last: " + last);
        return (int) lista.get(lista.size() - 2);

    }
}
