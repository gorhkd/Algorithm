import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] count = scanner.nextLine().split(" ");
        int[] numbers = new int[Integer.parseInt(count[0])];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }

        for (int i = 0; i < Integer.valueOf(count[1]); i++) {
            String[] method = scanner.nextLine().split(" ");

            for (int j = Integer.parseInt(method[0]); j <= Integer.parseInt(method[1]); j++) {
                numbers[j - 1] = Integer.parseInt(method[2]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}