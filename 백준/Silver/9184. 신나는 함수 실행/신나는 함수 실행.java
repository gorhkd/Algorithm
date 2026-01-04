import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[][][] arr = new long[51][51][51];

        for (int a = 0; a < 51; a++) {
            for (int b = 0; b < 51; b++) {
                for (int c = 0; c < 51; c++) {
                    if (a == 0 || b == 0 || c == 0) {
                        arr[a][b][c] = 1;
                    } else if (a > 20 | b > 20 || c > 20) {
                        arr[a][b][c] = 1048576;
                    } else if (a < b && b < c) {
                        arr[a][b][c] = arr[a][b][c - 1] + arr[a][b - 1][c - 1] - arr[a][b - 1][c];
                    } else {
                        arr[a][b][c] = arr[a - 1][b][c] + arr[a - 1][b - 1][c] + arr[a - 1][b][c - 1] - arr[a - 1][b - 1][c - 1];
                    }
                }
            }
        }

        boolean w = true;

        while (w) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && b  == -1 && c == -1) break;
            if (a <= 0 || b <= 0 || c <= 0) {
                sb.append("w(")
                        .append(a).append(", ").append(b).append(", ").append(c)
                        .append(") = ")
                        .append(1)
                        .append('\n');
                continue;
            }

            sb.append("w(")
                    .append(a).append(", ").append(b).append(", ").append(c).append(") = ")
                    .append(arr[a][b][c])
                    .append('\n');
        }

        System.out.println(sb);
    }
}