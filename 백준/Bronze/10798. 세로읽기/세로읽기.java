import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String c = br.readLine();
            for (int j = 0; j < 15; j++) {
                if (c.length() <= j) {
                    arr[i][j] = "?";
                } else {
                    arr[i][j] = String.valueOf(c.charAt(j));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != "?") {
                    sb.append(arr[j][i]);
                }
            }
        }

        System.out.println(sb);
    }
}