import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(scanner.nextLine());
        int[] f = new int[41];

        if (n == 1 || n == 2) sb.append(1).append(" ").append(1);
        else {
            f[1] = 1;
            f[2] = 1;

            for (int i = 3; i <= 40; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }

            sb.append(f[n]).append(" ").append(n - 2);
        }

        System.out.println(sb);;
    }
}