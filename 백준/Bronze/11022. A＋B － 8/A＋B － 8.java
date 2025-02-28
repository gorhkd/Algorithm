import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i < count + 1; i++) {
            String[] num = br.readLine().split(" ");
            int sum = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
            bw.write("Case #" + i  + ": " + num[0] + " + "+ num[1] + " = " + sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}