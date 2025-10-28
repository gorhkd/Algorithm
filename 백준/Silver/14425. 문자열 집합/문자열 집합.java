import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ownedCount = Integer.parseInt(st.nextToken());
        int checkCount = Integer.parseInt(st.nextToken());

        Set<String> ownedSet = new HashSet<>();    
        
        for (int i = 0; i < ownedCount; i++) {
            ownedSet.add(br.readLine());
        }
        
        int count = 0;
        
        while (checkCount > 0) {
            String s = br.readLine();
            if (ownedSet.contains(s)) count++;
            
            checkCount--;
        }


        System.out.println(count);
    }
}