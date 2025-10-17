import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n != 1) {
            if (0 == n % 2) {
                n /= 2;
                sb.append(2).append("\n");
            } else if (0 == n % 3) {
                n /= 3;
                sb.append(3).append("\n");
            } else {
                for (int i = 5; i <= n; i += 2) {
                    if (0 == n % i) {
                        sb.append(i).append("\n");
                        n /= i;
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
