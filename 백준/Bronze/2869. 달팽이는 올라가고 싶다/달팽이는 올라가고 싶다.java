import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long V = Integer.parseInt(st.nextToken());
        long day = 0;

        V -= A;
        if (0 == V % (A  - B)) {
            day = (V / (A  - B)) + 1;
        } else {
            day = (V / (A  - B)) + 2;        }

        System.out.println(day);
    }
}