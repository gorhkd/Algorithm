import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 1. 변경된 크로아티아 알파벳을 배열에 넣는다.
        String[] croatia = {"dz=", "lj", "nj"};

        // 2. 2중 for 문으로 해당 단어가 존재 시 cnt ++
        for (int i = 0; i < croatia.length; i++) {
            s = s.replace(croatia[i], "a");
        }

        // 3. 출력
        int cnt = 0;
        String c;
        for (int i = 0; i < s.length(); i++) {
            c = String.valueOf(s.charAt(i));
            if (!c.equals("=") && !c.equals("-")) cnt++;
        }

        System.out.println(cnt);
    }
}
