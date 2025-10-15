import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num = Long.parseLong(st.nextToken());
        int base = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            long res = num % base;
            char s;

            if (res < 10) {
                s = (char) ('0' + res);
            } else {
                s = (char) ('A' + res - 10);
            }

            sb.append(s);
            num = num / base;
        }

        System.out.println(sb.reverse());
    }
}