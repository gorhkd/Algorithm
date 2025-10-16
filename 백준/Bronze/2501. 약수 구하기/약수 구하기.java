import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 1; n2 != 0; i++) {
            if (n1 % i == 0) {
               result = i;
               n2--;
            } else if (n1 < i) {
                result = 0;
                break;
            }
        }

        System.out.print(result);
    }
}