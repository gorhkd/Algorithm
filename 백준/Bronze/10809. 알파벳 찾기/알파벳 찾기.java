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
        
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            
            if (result[index] == -1) {
                result[index] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < 25) sb.append(" ");
        }
        System.out.println(sb);
        }
    }