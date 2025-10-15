import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            int change = Integer.parseInt(br.readLine());

            if (change >= 25) {
                change = save(change, 25, sb);
            } else sb.append("0").append(" ");

            if (change >= 10) {
                change = save(change, 10, sb);
            } else sb.append("0").append(" ");

            if (change >= 5) {
                change = save(change, 5, sb);
            } else sb.append("0").append(" ");

            if (change >= 1) {
                change = save(change, 1, sb);
            } else sb.append("0").append(" ");
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static int save (int change, int num, StringBuilder sb) {
        int n = change / num;
        sb.append(n).append(" ");
        return change % num;
    }
}