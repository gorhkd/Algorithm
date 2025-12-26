import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        boolean dir = true;
        int right = T.length() - 1;
        int left = 0;

        while (S.length() != (right - left) + 1) {
            if (dir) {
                if (T.charAt(right) == 'A') right--;
                 else {
                    right--;
                    dir = false;
                 }
            }
            else {
                if (T.charAt(left) == 'A') left++;
                else {
                    left++;
                    dir = true;
                }
            }
        }

        T = T.substring(left, right + 1);

        if (!dir) {
            StringBuilder sb = new StringBuilder();

            for (int i = T.length() - 1; i >= 0; i--) {
                sb.append(T.charAt(i));
            }
            T = sb.toString();
        }

        System.out.println(S.equals(T) ? 1 : 0);
    }
}