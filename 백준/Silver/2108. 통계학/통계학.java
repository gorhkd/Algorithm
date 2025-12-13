import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long sum = 0;
        for (int a : arr) sum += a;

        int mean = (int)Math.round((double) sum / N);
        sb.append(mean).append("\n");

        Arrays.sort(arr);
        sb.append(arr[N / 2]).append("\n");

        int[] freq = new int[8001];
        int maxFreq = 0;

        for (int a : arr) {
            a += 4000;
            freq[a]++;
            maxFreq = Math.max(maxFreq, freq[a]);
        }

        int num = 0;
        int count = 0;
        for (int i = 0; i < 8001; i++) {
            if (count == 2) break;
            if (maxFreq == freq[i]) {
                num = i - 4000;
                count++;
            }
        }
        sb.append(num).append("\n");

        int range = arr[N - 1] - arr[0];
        sb.append(range);

        System.out.println(sb);
    }
}