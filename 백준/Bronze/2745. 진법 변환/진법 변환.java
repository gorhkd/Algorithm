import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken().toUpperCase();
        int base = Integer.parseInt(st.nextToken());

        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int v;
            if ('0' <= c && c <= '9') v = c - '0';
            else v = c - 'A' + 10;

            res = res * base + v;
        }

        System.out.println(res);
    }
}