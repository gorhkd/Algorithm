import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int bags = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                System.out.println(bags + n / 5);
                return;
            }
            n -= 3;
            bags++;
        }
        System.out.println(-1);
    }
}