import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];

        for (int i = 0; i < 30; i++) arr[i] = i + 1;

        for (int i = 0; i < 28; i ++) {
            arr[Integer.parseInt(br.readLine()) - 1] = 0;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= 29; i++) {
            if (arr[i] != 0) result.append(arr[i]).append("\n");

        }

        System.out.println(result);
    }
}