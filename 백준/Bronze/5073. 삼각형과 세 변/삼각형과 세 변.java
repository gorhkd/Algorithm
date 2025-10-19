import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) break;

            int[] x = {a, b, c};
            Arrays.sort(x);

            if (x[0] + x[1] <= x[2]) {
                sb.append("Invalid");
            } else if (x[0] == x[2]) {
                sb.append("Equilateral");
            } else if (x[0] == x[1] || x[1] == x[2]) {
                sb.append("Isosceles");
            } else {
                sb.append("Scalene");
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}