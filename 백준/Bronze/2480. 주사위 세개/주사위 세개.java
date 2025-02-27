import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        String[] numbers = cmd.split(" ");
        int[] list = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            list[i] = Integer.valueOf(numbers[i]);
        }

        if (list[0] == list[1] & list[0] == list[2]) {
            System.out.println(10000 + list[0] * 1000);
        } else if (list[0] == list[1] || list[0] == list[2]) {
            System.out.println(1000 + list[0] * 100);
        } else if (list[1] == list[2]) {
            System.out.println(1000 + list[1] * 100);
        } else {
            System.out.println(getMax(list) * 100);
        }

    }

    static int getMax(int[] Array) {
        int max = 0;

        for (int a : Array) {
            max = Math.max(max, a);
        }
        return max;
    }
}