import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C;
    static char[][] board;
    static boolean[] usedAlpha = new boolean[26];
    static int answer = 0;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st1.nextToken());
        C = Integer.parseInt(st1.nextToken());

        board = new char[R][C];
        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        dfs(0, 0, 1);

        System.out.println(answer);
    }

    static void dfs(int r, int c, int depth) {
        int idx = board[r][c] - 'A';
        usedAlpha[idx] = true;
        answer = Math.max(answer, depth);

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= R || nc < 0 || nc >= C) continue;

            int nextIdx = board[nr][nc] - 'A';
            if (!usedAlpha[nextIdx]) {
                dfs(nr, nc, depth + 1);
            }
        }

        usedAlpha[idx] = false;
    }
}