import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cur = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            cur += arr[i];
            ans = Math.max(ans, cur);
            if (cur < arr[i]) {
                cur = arr[i];
                ans = Math.max(ans, arr[i]);
            }
        }

        System.out.println(ans);
    }
}