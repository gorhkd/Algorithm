import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ownedCount = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> ownedMap = new HashMap<>(ownedCount * 2);
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < ownedCount; i++) {
            int n = Integer.parseInt(st1.nextToken());

            ownedMap.put(n, ownedMap.getOrDefault(n, 0) + 1);
        }

        int checkCount = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < checkCount; i++) {
            int n = Integer.parseInt(st2.nextToken());

            sb.append(ownedMap.getOrDefault(n, 0));

            if (i < checkCount - 1) sb.append(" ");
        }

        System.out.println(sb);
    }
}