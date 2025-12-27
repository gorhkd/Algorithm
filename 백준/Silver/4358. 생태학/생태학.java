import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> treeMap = new TreeMap<>();
        int total = 0;

        String s;
        while ((s = br.readLine()) != null) {
            treeMap.put(s, treeMap.getOrDefault(s, 0) + 1);
            total++;
        }

        for (Map.Entry<String, Integer> e : treeMap.entrySet()) {
            String name = e.getKey();
            int count = e.getValue();
            double percent = count * 100.0 / total;
            sb.append(name).append(' ')
                    .append(String.format(Locale.US, "%.4f", percent))
                    .append('\n');
        }

        System.out.println(sb);
    }
}