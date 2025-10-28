import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ownedCount = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> ownedMap = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < ownedCount; i++) {
            int n = Integer.parseInt(st1.nextToken());

            if (!ownedMap.containsKey(n)) {
                ownedMap.put(n, 1);
            } else {
                int value = ownedMap.get(n) + 1;
                ownedMap.put(n, value);
            }
        }

        int checkCount = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < checkCount; i++) {
            int n = Integer.parseInt(st2.nextToken());

            if (ownedMap.containsKey(n)) {
                sb.append(ownedMap.get(n)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}