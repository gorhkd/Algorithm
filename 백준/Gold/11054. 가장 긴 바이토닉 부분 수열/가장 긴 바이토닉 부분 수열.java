import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] inc = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            inc[i] = 1;
            for (int j = i - 1; j >= 1; j--) {
                if (arr[i] > arr[j] && inc[j] + 1 > inc[i]) inc[i] = inc[j] + 1;
            }
        }

        int[] dec = new int[N + 1];
        for (int i = N; i >= 1; i--) {
            dec[i] = 1;
            for (int j = i + 1; j <= N; j++) {
                if (arr[i] > arr[j] && dec[j] + 1 > dec[i]) dec[i] = dec[j] + 1;
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - 1);
        }

        System.out.println(ans);
    }
}