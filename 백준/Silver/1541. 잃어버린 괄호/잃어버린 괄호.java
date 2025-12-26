import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int answer = sumOfPlusGroup(s);
        System.out.println(answer);
    }

    static int sumOfPlusGroup(String s) {
        String[] arr = s.split("[-]");
        String[] numbers = arr[0].split("[+]");
        int sum = 0;
        for (String n : numbers) {
            sum += Integer.parseInt(n);
        }

        for (int i = 1; i < arr.length; i++) {
            String[] num = arr[i].split("[+]");
            int sumN = 0;
            for (String n : num) {
                sumN += Integer.parseInt(n);
            }
            sum -= sumN;
        }

        return sum;
    }
}