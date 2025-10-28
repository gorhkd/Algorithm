import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt1 = Integer.parseInt(br.readLine());
        int[] num = new int[cnt1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < cnt1; i++) {
            num[i] = Integer.parseInt(st1.nextToken());
        }

        int cnt2 = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> sumNum = new HashMap<>();
        int[] num2 = new int[cnt2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < cnt2; i++) {
            int n = Integer.parseInt(st2.nextToken());
            num2[i] = n;
            sumNum.put(n, 0);
        }

        for (int s : num) {
            if (sumNum.containsKey(s)) {
                sumNum.put(s, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int n : num2) {
            sb.append(sumNum.get(n)).append(" ");

        }

        System.out.println(sb);
    }
}
