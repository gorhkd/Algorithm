import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int K;
    static List<int[]> stones = new ArrayList<>();
    static boolean[][] treeMap = new boolean[5][5];
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            stones.add(new int[]{Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1});
        }

        if (stones.size() % 2 == 0) dfs(0, 0, 0);

        System.out.println(answer);
    }

    static void dfs(int r, int c, int cnt) {
        if (r == 4 && c == 4 && cnt == 24 - stones.size()) {
            answer++;
            return;
        }

        if (r == 4 && c == 4) return;
        if (treeMap[r][c]) return;

        for (int[] st : stones) {
            int sr = st[0];
            int sc = st[1];

            if (sr == r && sc == c) return;
        }

        treeMap[r][c] = true;

        if (r < 4) dfs(r + 1, c, cnt + 1);
        if (r > 0) dfs(r - 1, c, cnt + 1);
        if (c < 4) dfs(r, c + 1, cnt + 1);
        if (c > 0) dfs(r, c - 1, cnt + 1);

        treeMap[r][c] = false;
    }
}