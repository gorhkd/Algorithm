import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, M, H;
    static int homeR, homeC;
    static List<int[]> milks = new ArrayList<>();
    static boolean[] used;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int v = Integer.parseInt(st.nextToken());
                if (v == 1) {
                    homeR = i;
                    homeC = j;
                } else if (v == 2) milks.add(new int[]{i, j});
            }
        }
        
        used = new boolean[milks.size()];
        
        dfs(homeR, homeC, M, 0);

        System.out.println(answer);
    }
    
    static void dfs(int r, int c, int hp, int cnt) {
        int distHome = Math.abs(r - homeR) + Math.abs(c - homeC);
        if (distHome <= hp) answer = Math.max(answer, cnt);
        
        for (int i = 0; i < milks.size(); i++) {
            if (used[i]) continue;
            
            int[] milk = milks.get(i);
            int nr = milk[0];
            int nc = milk[1];
        
            int d = Math.abs(r - nr) + Math.abs(c - nc);
            
            if (hp >= d) {
                used[i] = true;
                dfs(nr, nc, hp - d + H, cnt + 1);
                used[i] = false;
            }
        }
    }
}