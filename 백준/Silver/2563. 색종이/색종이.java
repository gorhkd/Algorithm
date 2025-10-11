import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        boolean[][] num = new boolean[100][100];
        int sum = 0;

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int low = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (num[low + j][col + k] != true) {
                        num[low + j][col + k] = true;
                        sum ++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}