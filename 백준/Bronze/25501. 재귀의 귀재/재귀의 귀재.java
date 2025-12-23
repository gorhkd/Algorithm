import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            isPalindrome(s);
            cnt = 1;
        }

        System.out.println(sb);
    }

    public static void isPalindrome(String s) {
        int answer = recursion(s, 0, s.length() - 1);
        sb.append(answer + " ").append(cnt).append("\n");
    }

    public static int recursion(String s, int l, int r) {
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else
            cnt++;
            return recursion(s, l + 1, r - 1);
    }
}