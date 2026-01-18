import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A + 1];
        int[] dp = new int[A + 1];
        int answer = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[1];
        dp[1] = 1;

        for (int i = 2; i <= A; i++) {
            if (arr[i] <= min) {
                min = Math.min(min, arr[i]);
                dp[i] = 1;
                continue;
            }

            int temp = i;
            int best = 0;
            while (temp != 0) {
                if (arr[i] > arr[temp] && dp[temp] > best) {
                    best = dp[temp];
                }
                    temp--;
            }
            dp[i] = best + 1;
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}