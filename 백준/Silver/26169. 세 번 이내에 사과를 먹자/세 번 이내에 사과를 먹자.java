import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
     static int[][] arr = new int[5][5];
     static boolean[][] block = new boolean[5][5];
     static int[] rm = {1, -1, 0, 0};
     static int[] cm = {0, 0, 1, -1};
     static boolean answer = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        dfs(r, c, 0, 0);

        System.out.println(answer ? 1 : 0);
    }

    static void dfs(int r, int c, int cnt, int apple) {
        if (cnt == 4 || answer || block[r][c] || arr[r][c] == -1) return;
        if (arr[r][c] == 1) apple += 1;

        if (apple == 2) {
            answer = true;
            return;
        }

        block[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int rt = r + rm[i];
            int ct = c + cm[i];

            if (rt < 0 || rt > 4 || ct < 0 || ct > 4) continue;
            dfs(rt, ct, cnt + 1, apple);
        }
        block[r][c] = false;
    }
}