import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n = N;
        int a, b;
        int M = 0;

        while (n > 0) {
            a = n;
            b = a;

            while (a > 0) {
                b += a % 10;
                a /= 10;
            }

            if (N == b) {
                M = n;
            }
            n--;
        }

        System.out.println(M);
    }
}