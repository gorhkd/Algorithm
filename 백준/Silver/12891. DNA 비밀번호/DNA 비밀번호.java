import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st1.nextToken());
        int P = Integer.parseInt(st1.nextToken());
        String dna = br.readLine();

        int[] need = new int[4];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            need[i] = Integer.parseInt(st2.nextToken());
        }

        int[] arr = new int[4];
        for (int i = 0; i < P; i++) {
            arr[charCount(dna.charAt(i))]++;
        }

        int ans = 0;
        if (ok(need, arr)) ans++;

        for (int right = P; right < S; right++) {
            int left = right - P;

            arr[charCount(dna.charAt(left))]--;
            arr[charCount(dna.charAt(right))]++;
            if (ok(need, arr)) ans++;
        }

        System.out.println(ans);
    }

    static int charCount(char c) {
        if (c == 'A') return 0;
        else if (c == 'C') return 1;
        else if (c == 'G') return 2;
        return 3;
    }

    static boolean ok(int[] need, int[] arr) {
        for (int i = 0; i < 4; i++) {
            if (need[i] > arr[i]) return false;
        }
        return true;
    }
}