import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (0 == x[0] - x[1]) sb.append(x[2]).append(" ");
        if (0 == x[1] - x[2]) sb.append(x[0]).append(" ");
        if (0 == x[0] - x[2]) sb.append(x[1]).append(" ");

        if (0 == y[0] - y[1]) sb.append(y[2]);
        if (0 == y[1] - y[2]) sb.append(y[0]);
        if (0 == y[0] - y[2]) sb.append(y[1]);

        System.out.println(sb);
    }
}