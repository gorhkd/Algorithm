import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int max = 0, row = 0, col = 0;

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                int num = scan.nextInt();
                if (max < num) {
                    max = num;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        if (row == 0 && col == 0) {
            System.out.println(max + "\n" + 1 + " " + 1);
        } else {
            System.out.println(max + "\n" + row + " " + col);
        }
    }
}