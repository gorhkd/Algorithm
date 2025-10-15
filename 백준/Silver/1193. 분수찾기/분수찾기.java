import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int N = 1;
        int M = 1;
        int K = 2;
        boolean b = true;

        for (int i = cnt; i > 1; i--) {

            if (b) {
                if (N == 1 && M == K) {
                    N++;
                    M--;
                    K++;
                    b = false;
                } else if (N == 1 && M != K) {
                    M++;
                } else {
                    N--;
                    M++;
                }
            } else {
                if (M == 1 && N == K) {
                    N--;
                    M++;
                    K++;
                    b = true;
                } else if (M == 1 && N != K) {
                   N++;
                } else {
                    N++;
                    M--;
                }
            }
        }

        System.out.println(N + "/" + M);
    }
}