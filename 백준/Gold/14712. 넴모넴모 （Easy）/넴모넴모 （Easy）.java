import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean[][] board;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        dfs(0);
        System.out.println(answer);
    }

    static void dfs(int idx) {
        if (idx == N * M) {
            answer++;
            return;
        }

        int r = idx / M;
        int c = idx % M;

        dfs(idx + 1);

        board[r][c] = true;

        if (!makesSquare(r, c)) {
            dfs(idx + 1);
        }

        board[r][c] = false;
    }

    static boolean makesSquare(int r, int c) {
        if (r == 0 || c == 0) return false;

        return board[r][c]
                && board[r - 1][c]
                && board[r][c - 1]
                && board[r - 1][c - 1];
    }
}