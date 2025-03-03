import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < M; i++) {
            int i1 = scanner.nextInt();
            int j1 = scanner.nextInt();
            int k = scanner.nextInt();

            for (int j = i1 - 1; j < j1; j++) {
                numbers[j] = k;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}