import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        String a = cmd.nextLine();
        String b = cmd.nextLine();
        String[] time = a.split(" ");

        int sy = Integer.valueOf(time[0]);
        int bu = Integer.valueOf(time[1]);
        int cookOver = Integer.valueOf(b);
        int count = 0;

        bu += cookOver;

        while (bu >= 60) {
            bu -= 60;
            count++;
        }

        sy += count;
        if (sy >= 24) {
            sy -= 24;
        }
        see(sy, bu);

    }

    static void see(int a, int b) {
        System.out.println(a + " " + b);
    }
}