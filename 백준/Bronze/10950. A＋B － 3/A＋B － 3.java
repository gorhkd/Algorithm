import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] list = scanner.nextLine().split(" ");
            System.out.println(Integer.parseInt(list[0]) + Integer.parseInt(list[1]));
        }
    } 
}