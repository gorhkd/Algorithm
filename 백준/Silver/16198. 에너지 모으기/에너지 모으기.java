import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] used;
    static int sum = 0;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        used = new boolean[N];
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1);

        System.out.println(answer);
    }

    static void dfs(int cnt) {
        if (cnt == N - 1) {
            if (answer < sum) answer = sum;
            return;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (used[i]) continue;
            used[i] = true;
            int n = i - 1;
            int m = i + 1;
            while (used[n]) n--;
            while (used[m]) m++;
            sum += arr[n] * arr[m];
            dfs(cnt + 1);

            sum -= arr[n] * arr[m];
            used[i] = false;
        }
    }
}