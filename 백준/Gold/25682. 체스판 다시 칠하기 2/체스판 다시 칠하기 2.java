import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] startB = new int[N + 1][M + 1];
        int[][] startW = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();

            for (int j = 1; j <= M; j++) {
                char c = s.charAt(j - 1);

                if (i % 2 == 1) {
                    if ((j % 2 == 1 && c == 'W') || j % 2 == 0 && c == 'B') {
                        startB[i][j] = startB[i][j - 1] + startB[i - 1][j] + 1 - startB[i - 1][j - 1];
                        startW[i][j] = startW[i][j - 1] + startW[i - 1][j] - startW[i - 1][j - 1];
                    } else {
                        startB[i][j] = startB[i][j - 1] + startB[i - 1][j] - startB[i - 1][j - 1];
                        startW[i][j] = startW[i][j - 1] + startW[i - 1][j] + 1 - startW[i - 1][j - 1];
                    }
                } else {
                    if ((j % 2 == 1 && c == 'B') || j % 2 == 0 && c == 'W') {
                        startB[i][j] = startB[i][j - 1] + startB[i - 1][j] + 1 - startB[i - 1][j - 1];
                        startW[i][j] = startW[i][j - 1] + startW[i - 1][j] - startW[i - 1][j - 1];
                    } else {
                        startB[i][j] = startB[i][j - 1] + startB[i - 1][j] - startB[i - 1][j - 1];
                        startW[i][j] = startW[i][j - 1] + startW[i - 1][j] + 1 - startW[i - 1][j - 1];
                    }
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int i = N; i >= K; i--) {
            for (int j = M; j >= K; j--) {
                int b = startB[i][j] - startB[i - K][j] - startB[i][j - K] + startB[i - K][j - K];
                int w = startW[i][j] - startW[i - K][j] - startW[i][j - K] + startW[i - K][j - K];
                ans = Math.min(ans, Math.min(b, w));
            }
        }
        System.out.println(ans);
    }
}