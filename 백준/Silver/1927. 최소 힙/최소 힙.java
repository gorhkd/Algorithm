
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int next = Integer.parseInt(br.readLine());

            if (next == 0) {
                if (queue.isEmpty()) {
                    sb.append(0);
                } else {
                    sb.append(queue.poll());
                }

                sb.append('\n');
            } else {
                queue.add(next);
            }
        }

        System.out.println(sb);
    }
}