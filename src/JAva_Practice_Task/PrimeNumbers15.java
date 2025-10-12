package JAva_Practice_Task;

public class PrimeNumbers15 {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();

        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                if (out.length() > 0) out.append(' ');
                out.append(n);
            }
        }

        System.out.println(out.toString());
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int d = 3; d * d <= n; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }
}
