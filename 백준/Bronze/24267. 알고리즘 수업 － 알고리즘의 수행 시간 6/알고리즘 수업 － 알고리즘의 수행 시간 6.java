import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        long n = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long t = n * (n - 1) * (n - 2) / 6;
        System.out.println(t);
        System.out.println(3);
    }
}