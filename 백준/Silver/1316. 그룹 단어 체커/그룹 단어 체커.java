import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int gn = 0;

        for (int i = 0; i < cnt; i++) {
            int[] abc = new int[26];
            String s = br.readLine();
            boolean t = true;

            abc[s.charAt(0) - 'a']++;
            for (int j = 1; j < s.length(); j++) {
                int idx = s.charAt(j) - 'a';
                abc[idx]++;
                if (abc[idx] > 1 && s.charAt(j) != s.charAt(j - 1)) {
                    t = false;
                }
            }
            if (t) gn++;
        }
        System.out.println(gn);
    }
}