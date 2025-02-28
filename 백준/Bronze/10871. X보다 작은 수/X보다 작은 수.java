import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ph = scanner.nextLine().split(" ");
        String[] num = scanner.nextLine().split(" ");

        for (int i = 0; i < Integer.parseInt(ph[0]); i++) {
            if (Integer.parseInt(ph[1]) > Integer.parseInt(num[i])) {
                System.out.print(Integer.parseInt(num[i]) + " ");
            }
        }
    }
}