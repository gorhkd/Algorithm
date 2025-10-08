import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        StringBuffer revers1 = new StringBuffer(s1);
        StringBuffer revers2 = new StringBuffer(s2);

        int n1 = Integer.parseInt(String.valueOf(revers1.reverse()));
        int n2 = Integer.parseInt(String.valueOf(revers2.reverse()));

        System.out.println(n1 > n2 ? n1 : n2);
    }
}