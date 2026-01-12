import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N + 1];
        
        dp[0] = 0;
        if (N >= 1) dp[1] = arr[1];
        if (N >= 2) dp[2] = arr[1] + arr[2];
        
        for (int i = 3; i <= N; i++) {
            int case1 = dp[i - 1];
            int case2 = dp[i - 2] + arr[i];
            int case3 = dp[i - 3] + arr[i - 1] + arr[i];
            dp[i] = Math.max(case1, Math.max(case2, case3));
        }

        System.out.println(dp[N]);
    }
}