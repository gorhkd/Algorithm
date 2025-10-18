import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int result = 0;

        if (w - x > x) {
            result = x;
        } else {
            result = w - x;
        }

        if (h - y > y && result > y) {
            result = y;
        } else if (h - y < y && result > h - y) {
            result = h - y;
        }

        System.out.println(result);

    }
}