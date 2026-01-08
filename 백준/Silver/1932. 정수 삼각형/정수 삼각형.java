import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        int[][] arr = new int[N][N];
        arr[0][0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (j == 0) {
                    arr[i][j] += arr[i - 1][j];
                } else if (j == i) {
                    arr[i][j] += arr[i - 1][j - 1];
                } else {
                    arr[i][j] += Math.max(arr[i - 1][j - 1], arr[i - 1][j]);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, arr[N - 1][i]);
        }

        System.out.println(ans);
    }
}