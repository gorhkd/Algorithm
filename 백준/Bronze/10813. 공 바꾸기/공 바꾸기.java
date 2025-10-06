import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = i + 1;

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i > 0) sb.append(' ');
            sb.append(arr[i]);
        }
        System.out.print(sb);
    }
}