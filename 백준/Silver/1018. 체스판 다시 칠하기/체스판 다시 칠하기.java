import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int low = Integer.parseInt(st.nextToken());

        char[][] chars = new char[col][low];

        for (int i = 0; i < col; i++) {
            String s = br.readLine();
            for (int j = 0; j < low; j++) {
                chars[i][j] = s.charAt(j);
            }
        }

        char[] case1 = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        char[] case2 = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        int min = 64;
        int a = 0, b = 0;

        while (a != col - 7 && b != low -  7) {
            int cnt = 0;

            for (int i = 0 + a; i < 8 + a; i++) {
                int up = 0;

                for (int j = 0 + b; j < 8 + b; j++) {

                    if (0 == i % 2) {
                        if (chars[i][j] != case1[up]) {
                            cnt++;
                        }
                    }

                    if (1 == i % 2) {
                        if (chars[i][j] != case2[up]) {
                            cnt++;
                        }
                    }
                        up++;
                }
            }

            min = Math.min(min, cnt);
            cnt = 0;

            for (int i = 0 + a; i < 8 + a; i++) {
                int up = 0;

                for (int j = 0 + b; j < 8 + b; j++) {
                    if (0 == i % 2) {
                        if (chars[i][j] != case2[up]) {
                            cnt++;
                        }
                    }

                    if (1 == i % 2) {
                        if (chars[i][j] != case1[up]) {
                            cnt++;
                        }
                    }
                    up++;
                }
            }

            min = Math.min(min, cnt);
            b++;

            if (b == low - 7) {
                b = 0;
                a++;
            }
        }


        System.out.println(min);
    }
}