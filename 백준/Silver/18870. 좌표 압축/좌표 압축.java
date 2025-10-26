import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int[] origin = new int[cnt];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = origin.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        int idx = 0;
        for (int x : sorted) {
            if (!rank.containsKey(x)) {
                rank.put(x, idx);
                idx++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int x : origin) {
            sb.append(rank.get(x)).append(" ");
        }

        System.out.println(sb);
    }
}