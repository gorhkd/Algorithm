import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] N = new int[cnt][2];
        
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                N[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(N, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 2; j++) {
                sb.append(N[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}