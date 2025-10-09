import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 1; i <= cnt; i++) {
            for (int j = cnt - i; j > 0; j--) sb.append(" ");
            for (int j = 1 ; j < (i * 2); j ++) sb.append("*");
            sb.append("\n");
        }

        for (int i = 1; i < cnt; i++) {
            for (int j = 0; j < i; j++) sb.append(" ");
            for (int j = 0; j < (cnt * 2 - 1) - (i * 2); j++) sb.append("*");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}