import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        
        for (int i = 4; i <= 100; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        while (T > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(arr[N]).append('\n');
            T--;
        }

        System.out.println(sb);
    }
}