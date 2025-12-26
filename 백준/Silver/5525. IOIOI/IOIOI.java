import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int ans = 0;
        int cnt = 0;
        int i = 0;
        
        while (i <= size - 3) {
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                cnt++;
                i += 2;

                if (cnt == N) {
                    ans++;
                    cnt--;
                }
            
            } else {
                cnt = 0;
                i++;
            }
            
        }
        
        
        System.out.println(ans);
    }
}