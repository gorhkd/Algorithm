import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, K;
    static String[] cores;
    static boolean[] know = new boolean[26];
    static int answer = 0;
    static int target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (K < 5) {
            System.out.println(0);
            return;
        }

        if (K == 26) {
            for (int i = 0; i < N; i++) br.readLine();
            System.out.println(N);
            return;
        }

        cores = new String[N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            cores[i] = s.substring(4, s.length() - 4);
        }

        markEssential();
        
        target = K - 5;

        if (target == 0) {
            System.out.println(countReadable());
            return;
        }

        dfs(0, 0);

        System.out.println(answer);
    }

    static void markEssential() {
        know['a' - 'a'] = true;
        know['n' - 'a'] = true;
        know['t' - 'a'] = true;
        know['i' - 'a'] = true;
        know['c' - 'a'] = true;
    }

    static void dfs(int start, int picked) {
        if (picked == target) {
            answer = Math.max(answer, countReadable());
            return;
        }

        if (26 - start < target - picked) return;

        for (int i = start; i < 26; i++) {
            if (know[i]) continue;

            know[i] = true;
            dfs(i + 1, picked + 1);
            know[i] = false;
        }
    }

    static int countReadable() {
        int count = 0;

        for (String core : cores) {
            boolean ok = true;

            for (int j = 0; j < core.length(); j++) {
                char ch = core.charAt(j);
                int idx = ch - 'a';

                if (!know[idx]) {
                    ok = false;
                    break;
                }
            }

            if (ok) count++;
        }

        return count;
    }
}