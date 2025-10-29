import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        String str = br.readLine();

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j + i <= str.length(); j++) {
                String s = str.substring(j, j + i);
                set.add(s);
            }
        }

        System.out.println(set.size());
    }
}