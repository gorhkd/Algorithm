import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[] permutation;
    static int[] operator = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        permutation = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            permutation[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(1, permutation[0]);
        System.out.println(max + "\n" + min);
    }

    static void dfs(int depth, int sum) {
        if (depth == N) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        int a = permutation[depth];

        for (int j = 0; j < 4; j++) {
            int temp = sum;

            if (operator[j] != 0) {
                if (j == 0) temp += a;
                if (j == 1) temp -= a;
                if (j == 2) temp *= a;
                if (j == 3) temp /= a;
                operator[j]--;
                dfs(depth + 1, temp);
                operator[j]++;
            }
        }
    }
}