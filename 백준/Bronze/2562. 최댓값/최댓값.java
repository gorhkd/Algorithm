import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            scanner.nextLine();

            if (max < num) {
                max = num;
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}