import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[][] bord = new char[5][5];
    static int answer = 0;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < 5; j++) {
                bord[i][j] = line.charAt(j);
            }
        }

        combination(0, 0, new ArrayList<>());

        System.out.println(answer);
    }

    static void combination(int start, int count, List<Integer> selected) {
        if (count == 7) {
            if (isValid(selected)) {
                answer++;
            }
            return;
        }

        for (int i = start; i < 25; i++) {
            selected.add(i);
            combination(i + 1, count + 1, selected);
            selected.remove(selected.size() - 1);
        }
    }

    static boolean isValid(List<Integer> selected) {
        int sCount = 0;
        for (int pos : selected) {
            int r = pos / 5;
            int c = pos % 5;
            if (bord[r][c] == 'S') {
                sCount++;
            }
        }
        if (sCount < 4) return false;

        return isConnected(selected);
    }

    static boolean isConnected(List<Integer> selected) {
        Set<Integer> set = new HashSet<>(selected);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        int start = selected.get(0);
        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int r = current / 5;
            int c = current % 5;

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr < 0 || nr >= 5 || nc < 0 || nc >= 5) continue;

                int next = nr * 5 + nc;

                if (set.contains(next) && !visited.contains(next)) {
                    visited.add(next);
                    queue.offer(next);
                }
            }
        }

        return visited.size() == 7;
    }
}
