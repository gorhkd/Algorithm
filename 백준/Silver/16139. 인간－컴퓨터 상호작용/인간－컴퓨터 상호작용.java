import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = s.length();

        int[][] prefix = new int[26][n + 1];

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';

            for (int k = 0; k < 26; k++) {
                prefix[k][i + 1] = prefix[k][i];
            }
            prefix[c][i + 1]++;
        }

        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            sb.append(prefix[c][r + 1] - prefix[c][l]).append('\n');
        }

        System.out.print(sb);
    }
}