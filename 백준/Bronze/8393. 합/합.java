import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        int count = Integer.valueOf(cmd);
        int sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}