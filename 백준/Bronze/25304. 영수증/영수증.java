import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            String[] num = scanner.nextLine().split(" ");
            sum -= Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
        }
        System.out.println(sum == 0 ? "Yes" : "No");
        }
    }