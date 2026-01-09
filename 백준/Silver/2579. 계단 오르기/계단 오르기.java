import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] s = new int[N + 1];

        for (int i = 1; i <= N; i++) {
           s[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(s[1]);
        } else if (N == 2) {
            System.out.println(s[1] + s[2]);
        } else {
            long[] dp = new long[N + 1];
            dp[1] = s[1];
            dp[2] = s[1] + s[2];
            dp[3] = Math.max(s[1] + s[3], s[2] + s[3]);

            for (int i = 4; i <= N; i++) {
                dp[i] = Math.max(dp[i - 2], s[i - 1] + dp[i - 3]) + s[i];
            }

            System.out.println(dp[N]);
        }
    }
}