import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cmd = scanner.nextLine().split(" ");
        int[] number = new int[cmd.length];

        for (int i = 0; i < cmd.length; i++) {
            number[i] = Integer.parseInt(cmd[i]);
        }

        int[] result = new int[number[0]];

        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }

        for (int i = 0; i < number[1]; i++) {
            String[] num = scanner.nextLine().split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);

            int c = result[a - 1];
            result[a - 1] = result[b - 1];
            result[b - 1] = c;
        }

        for (int i = 0; i < result.length; i++) {
            if (i != result.length - 1) {
                System.out.print(result[i] + " ");
            } else {
                System.out.print(result[i]);
            }
        }
    }
}