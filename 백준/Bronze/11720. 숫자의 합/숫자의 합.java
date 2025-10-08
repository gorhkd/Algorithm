import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;
        String s = br.readLine();

        for (int i = 0; i < cnt; i++) {
            String n = s.substring(i, i + 1);
            sum += Integer.parseInt(n);
        }

        System.out.println(sum);
    }
}