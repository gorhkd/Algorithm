import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            num = (s.charAt(i) - 'A');

            if (num <= 14) {
                sum += (num / 3) + 3;
            }

            if (num > 14) {
                if (num >= 22) {
                    sum += 10;
                } else if (num >= 19) {
                    sum += 9;
                } else {
                    sum += 8;
                }
            }
        }

        System.out.println(sum);
    }
}