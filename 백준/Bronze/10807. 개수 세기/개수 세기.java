import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt(), sum = 0, num;
        scanner.nextLine();

        String[] numbers = scanner.nextLine().split(" ");
        num = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (num == Integer.parseInt(numbers[i])) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}