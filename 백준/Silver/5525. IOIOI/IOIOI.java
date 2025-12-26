import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;

        StringBuilder sb = new StringBuilder("IOI");
        for (int i = 1; i < N; i++) {
            sb.append("OI");
        }

        String valid = sb.toString();

        for (int i = 0; i <= size - valid.length(); i++) {
            String subString = s.substring(i, i + valid.length());
            if (valid.equals(subString)) {
                answer++;
                i ++;
            }
        }

        System.out.println(answer);
    }
}