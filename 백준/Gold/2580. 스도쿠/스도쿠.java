import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] bord = new int[9][9];
    static ArrayList<int[]> empties = new ArrayList<>();
    static int M;
    static StringBuilder sb = new StringBuilder();
    static boolean solved = false;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int r = 0; r < 9; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 9; c++) {
                bord[r][c] = Integer.parseInt(st.nextToken());
                if (bord[r][c] == 0) {
                    empties.add(new int[]{r, c});
                }
            }
        }

        M = empties.size();

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int idx) {
        if (solved) return;

        if (idx == M) {
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    sb.append(bord[r][c]).append(" ");
                }
                sb.append("\n");
            }
            solved = true;
            return;
        }

        int[] pos = empties.get(idx);
        int r = pos[0];
        int c = pos[1];

        for (int n = 1; n <= 9; n++) {
            if (canPut(r, c, n)) {
                bord[r][c] = n;
                dfs(idx + 1);
                bord[r][c] = 0;
            }
        }
    }

    static boolean canPut(int r, int c, int n) {
        for (int i = 0; i < 9; i++) if (bord[r][i] == n) return false;
        for (int i = 0; i < 9; i++) if (bord[i][c] == n) return false;

        int tr = (r / 3) * 3;
        int tc = (c / 3) * 3;
        for (int i = tr; i < tr + 3; i++) {
            for (int j = tc; j < tc + 3; j++) {
                if (bord[i][j] == n) return false;
            }
        }

        return true;
    }
}