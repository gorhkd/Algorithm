import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];
        int ans;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    dp[i][j] += Math.min(dp[i - 1][1], dp[i - 1][2]);
                }
                else if (j == 1) {
                    dp[i][j] += Math.min(dp[i - 1][0], dp[i - 1][2]);
                }
                else {
                    dp[i][j] += Math.min(dp[i - 1][0], dp[i - 1][1]);
                }
            }
        }

        ans = Math.min(dp[N - 1][0], dp[N - 1][1]);
        ans = Math.min(ans, dp[N - 1][2]);

        System.out.println(ans);
    }
}