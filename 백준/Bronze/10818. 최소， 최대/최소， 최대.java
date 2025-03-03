import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        String[] num = scanner.nextLine().split(" ");

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < count; i++) {
            max = Math.max(Integer.valueOf(num[i]), max);
            min = Math.min(Integer.valueOf(num[i]), min);
        }
        System.out.println(min + " " + max);
    }
}