import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] num = new int[26];

        // 1. 해당 자리 알파벳 개수 증가.
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'A'] ++;
        }

        // 2. 최댓값 구하기.
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < 26; i++) {
            if (num[i] > max) {
                max = num[i];
                maxIdx = i;
            }
        }

        // 3. 만약 최대값이 같은 값이 있으면 "?" 출력
        boolean c = false;
        for (int i = 0; i < 26; i++) {
            if (maxIdx != i && num[maxIdx] == num[i]) {
                c = true;
            }
        }

        // 4. 아니면 해당 알파뱃 출력
        if (!c) System.out.println((char) (maxIdx + 65));
        if (c) System.out.println("?");

    }
}