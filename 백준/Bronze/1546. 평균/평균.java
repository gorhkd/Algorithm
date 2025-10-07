import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double M = 0.0;
        double[] arr = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble((st.nextToken()));
            if (M < arr[i]) M = arr[i];
        }

        for (int i = 0; i < N; i++) {
            arr[i] = (arr[i] * 100) / M ;
        }

        double result = 0.0;
        for (int i = 0; i < N; i++) {
            result += arr[i];
        }

        System.out.println(result / N);
    }
}