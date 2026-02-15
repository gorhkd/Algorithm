import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // ps[i][j] = (1,1)이 'B'로 시작하는 체스판 패턴 기준 mismatch(0/1)의 2D prefix sum
        int[][] ps = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String row = br.readLine();
            for (int j = 1; j <= M; j++) {
                char c = row.charAt(j - 1);

                // (i+j) 짝수면 expected='B', 홀수면 expected='W' (좌상단 B 시작 가정)
                char expected = (((i + j) & 1) == 0) ? 'B' : 'W';
                int mismatch = (c == expected) ? 0 : 1;

                ps[i][j] = ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1] + mismatch;
            }
        }

        int ans = Integer.MAX_VALUE;
        int kk = K * K;

        // (i, j)를 KxK 구간의 오른쪽-아래 꼭짓점으로 두고 구간합 계산
        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                int x = ps[i][j] - ps[i - K][j] - ps[i][j - K] + ps[i - K][j - K]; // start='B' repaint
                int repaint = Math.min(x, kk - x); // start='W'는 보완
                if (repaint < ans) ans = repaint;
            }
        }

        System.out.println(ans);
    }
}