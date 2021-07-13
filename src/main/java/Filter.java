
import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<Integer> selectPrime(List<Integer> numbers) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
