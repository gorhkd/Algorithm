import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

        int[] dp = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int a = arr[i][1];
            dp[i] = 1;

            for (int j = i - 1; j >= 0; j--) {
                if (a > arr[j][1] && dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
            }
            ans = Math.max(ans, dp[i]);
        }

        System.out.println(N - ans);
    }
}