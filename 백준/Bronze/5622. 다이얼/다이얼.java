import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] TIME = {
                3,3,3, 4,4,4, 5,5,5, 6,6,6, 7,7,7, 8,8,8,8, 9,9,9, 10,10,10,10
        };
        int num;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            num = (s.charAt(i) - 'A');
            sum += TIME[num];
        }

        System.out.println(sum);
    }
}