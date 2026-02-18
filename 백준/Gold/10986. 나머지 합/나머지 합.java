import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] freq = new long[M];
        freq[0] = 1;

        st = new StringTokenizer(br.readLine());
        long sum = 0;

        for (int i = 1; i <= N; i++) {
            long a = Long.parseLong(st.nextToken());
            sum = (sum + a) % M;
            freq[(int) sum]++;
        }

        long ans = 0;
        for (int r = 0; r < M; r++) {
            long c = freq[r];
            ans += c * (c - 1) / 2;
        }

        System.out.println(ans);
    }
}