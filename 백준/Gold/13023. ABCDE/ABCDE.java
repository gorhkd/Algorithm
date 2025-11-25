import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] used;
    static List<Integer>[] arr;
    static boolean answer = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());

        arr = new ArrayList[N];
        used = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for (int num = 0; num < N; num++) {
            Arrays.fill(used, false);
            dfs(num, 0);
            if (answer) break;
        }

        System.out.println(answer ? 1 : 0);
    }

    static void dfs(int num, int cnt) {
        if (answer) return;
        if (cnt == 4) {
            answer = true;
            return;
        }

        used[num] = true;

        for (int next : arr[num]) {
            if (!used[next]) {
                dfs(next, cnt + 1);
            }
        }
        used[num] = false;
    }
}