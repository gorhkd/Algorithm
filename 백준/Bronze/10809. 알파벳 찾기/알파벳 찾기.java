import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] result = new int[26];
        for (int i = 0; i < 26; i++) {
            result[i] = -1;
        }

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - 'a';
        }

        for (int i = 0; i < arr.length; i++) {
            if (result[arr[i]] == -1) {
                result[arr[i]] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
        }
    }