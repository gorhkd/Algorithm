import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] N = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            N[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(N);
        StringBuilder sb = new StringBuilder();

        for (int n : N) {
            sb.append(n).append("\n");
        }
        
        System.out.println(sb);
    }
}