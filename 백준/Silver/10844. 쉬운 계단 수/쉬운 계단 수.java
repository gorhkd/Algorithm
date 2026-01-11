import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N + 1][10];

        dp[1][0] = 0;
        for (int d = 1; d <= 9; d++) dp[1][d] = 1;

        for (int len = 2; len <= N; len++) {
            dp[len][0] = dp[len - 1][1] % MOD;
            dp[len][9] = dp[len - 1][8] % MOD;

            for (int d = 1; d <= 8; d++) {
                dp[len][d] = (dp[len - 1][d - 1] + dp[len - 1][d + 1]) % MOD;
            }
        }

        long ans = 0;
        for (int d = 0; d <= 9; d++) ans = (ans + dp[N][d]) % MOD;

        System.out.println(ans);
    }
}
