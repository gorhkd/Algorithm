import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine().trim());
        int N = Integer.parseInt(br.readLine().trim());

        int sum = 0;
        int minPrime = -1;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (minPrime == -1) minPrime = i;
            }
        }

        if (minPrime == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
        static boolean isPrime(int x) {
            if (x < 2) return false;
            if (x == 2) return true;
            if (x % 2 == 0) return false;
            for (int d = 3; d <= x / d; d += 2) {
                if (x % d == 0) return false;
            }
            return true;
        }
}
