public class Primes {
    // Для нахождения и вывода всех простых чисел до 100
    public static void main(String[] args) {
        final int MAX = 100;
        for (int i = 2; i < MAX; i++) {
            if (IsPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    // Определяет является ли число простым
    public static boolean IsPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}