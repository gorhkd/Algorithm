import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[] bord;
    static boolean[] used;
    static int N, M;
    static List<Integer> teachers = new ArrayList<>();
    static boolean answer = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        N = (M * M) - 1;
        bord = new char[M * M];
        used = new boolean[M * M];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = (i * M) + j;
                bord[num] = st.nextToken().charAt(0);
                if (bord[num] == 'T') {
                    teachers.add(num);
                }
            }
        }

        dfs(0, 0);
        System.out.println(answer ? "YES" : "NO");
    }

    static void dfs (int depth, int cnt) {
        if (answer) return;
        
        if (cnt == 3) {
            if (invalid()) answer = true;
            return;
        }
        
        if (depth > N) return;

        for (int i = depth; i <= N; i++) {
            if (bord[i] == 'X' && !used[i]) {
                used[i] = true;
                dfs(i + 1, cnt + 1);
                used[i] = false;
            }
        }

    }

    static boolean invalid () {
        for (int t : teachers) {

            for (int i = t - M; i >= 0; i -= M) {
                if (bord[i] == 'S') return false;
                if (used[i]) break;
            }

            for (int i = t + M; i <= N; i += M) {
                if (bord[i] == 'S') return false;
                if (used[i]) break;
            }

            for (int i = t + 1; i <= N && i % M != 0; i++) {
                if (bord[i] == 'S') return false;
                if (used[i]) break;
            }

            for (int i = t - 1; i >= 0 && i % M != M - 1; i--) {
                if (bord[i] == 'S') return false;
                if (used[i]) break;
            }

        }
        return true;
    }
}