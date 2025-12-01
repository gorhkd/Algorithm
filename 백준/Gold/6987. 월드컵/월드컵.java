import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int TEAM = 6;
    static final int GAME = 15;
    static int[][] need = new int[TEAM][3];
    static int[][] games = new int[GAME][2];
    static boolean possible;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        initGames();

        for (int t = 0; t < 4; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int winSum = 0;
            int drawSum = 0;
            int loseSum = 0;
            boolean ok = true;

            for (int i = 0; i < TEAM; i++) {
                int w = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());

                need[i][0] = w;
                need[i][1] = d;
                need[i][2] = l;

                if (w + d + l != 5) ok = false;

                winSum += w;
                drawSum += d;
                loseSum += l;
            }

            if (!ok || winSum != loseSum || (drawSum % 2 != 0)) {
                sb.append(0).append(' ');
                continue;
            }

            possible = false;
            dfs(0);
            sb.append(possible ? 1 : 0).append(' ');
        }

        System.out.println(sb.toString().trim());
    }

    static void initGames() {
        int idx = 0;
        for (int i = 0; i < TEAM; i++) {
            for (int j = i + 1; j < TEAM; j++) {
                games[idx][0] = i;
                games[idx][1] = j;
                idx++;
            }
        }
    }

    static void dfs(int idx) {
        if (possible) return;
        if (idx == GAME) {
            possible = true;
            return;
        }

        int a = games[idx][0];
        int b = games[idx][1];

        if (need[a][0] > 0 && need[b][2] > 0) {
            need[a][0]--;
            need[b][2]--;
            dfs(idx + 1);
            need[a][0]++;
            need[b][2]++;
        }

        if (need[a][1] > 0 && need[b][1] > 0) {
            need[a][1]--;
            need[b][1]--;
            dfs(idx + 1);
            need[a][1]++;
            need[b][1]++;
        }

        if (need[a][2] > 0 && need[b][0] > 0) {
            need[a][2]--;
            need[b][0]--;
            dfs(idx + 1);
            need[a][2]++;
            need[b][0]++;
        }
    }
}