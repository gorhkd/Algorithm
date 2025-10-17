import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i = 0; i < cnt; i++) {
            int n = Integer.parseInt(st.nextToken());
            boolean b = true;

            for (int j = 1; j <= n; j++) {
                if (n == 1) {
                    b = false;
                }
                if (j != 1 && j != n && 0 == n % j) {
                    b = false;
                }
            }
            if (b) sum ++;
        }

        System.out.println(sum);
    }
}