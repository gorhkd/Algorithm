import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[] used;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        used = new boolean[N];

        for (int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        used[0] = true;
        dfs(1, 1);

        System.out.println(answer);
    }

    static void dfs(int depth, int cnt) {
        if (cnt == N / 2) {
            answer = Math.min(answer, sumRest());
            return;
        }

        for (int i = depth; i < N; i++) {
            used[i] = true;
            dfs(i + 1, cnt + 1);
            used[i] = false;
            if (!used[0]) break;
        }
    }

    static int sumRest() {
        int A = 0;
        int B = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (used[i] && used[j]) {
                    A += arr[i][j];
                }

                if (!used[i] && !used[j]) {
                    B += arr[i][j];
                }
            }
        }

        return Math.abs(A - B);
    }
}