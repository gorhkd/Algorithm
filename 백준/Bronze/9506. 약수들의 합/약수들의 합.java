import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            String s = n + " = " + 1;
            int sum = 1;

            for (int i = 2; i < n; i++) {
                if (0 == n % i) {
                 s += " + " + i;
                 sum += i;
                }
            }
            if (n == sum) {
                System.out.println(s);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
            n = Integer.parseInt(br.readLine());
        }

    }
}