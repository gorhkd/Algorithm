import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String rule = br.readLine();
            int size = Integer.parseInt(br.readLine());
            String inputString = br.readLine();

            int sumD = 0;
            for (int j = 0; j < rule.length(); j++) {
                if (rule.charAt(j) == 'D') sumD++;
            }

            if (sumD > size || (size == 0 && sumD > 0)) {
                sb.append("error").append("\n");
                continue;
            }

            if (size == 0) {
                sb.append("[]").append("\n");
                continue;
            }

            String[] numberArr = inputString.substring(1, inputString.length() - 1).split(",");
            Deque<Integer> deque = new ArrayDeque<>();
            boolean dir = true;

            for (String s : numberArr) {
                deque.add(Integer.parseInt(s));
            }

            for (int j = 0; j < rule.length(); j++) {
                char c = rule.charAt(j);
                if (c == 'R') {
                    dir = dir ? false : true;
                } else if (c == 'D') {
                    if (dir) deque.pollFirst();
                    if (!dir) deque.pollLast();
                }
            }

            sb.append("[");
            while (true) {
                if (deque.isEmpty()) break;
                if (dir) sb.append(deque.pollFirst());
                else if (!dir) sb.append(deque.pollLast());
                if(!deque.isEmpty()) sb.append(',');
            }
            sb.append("]").append("\n");
        }

        System.out.println(sb);
    }
}