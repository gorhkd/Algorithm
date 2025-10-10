
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double scoreSum = 0;  // (학점 × 평점)의 합
        double creditSum = 0; // 학점의 합
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            
            String subject = parts[0];
            double credit = Double.parseDouble(parts[1]);
            String grade = parts[2];
            
            // P 과목은 제외
            if (grade.equals("P")) {
                continue;
            }
            
            // 등급을 평점으로 변환
            double point = 0;
            switch (grade) {
                case "A+" : point = 4.5; break;
                case "A0" : point = 4.0; break;
                case "B+" : point = 3.5; break;
                case "B0" : point = 3.0; break;
                case "C+" : point = 2.5; break;
                case "C0" : point = 2.0; break;
                case "D+" : point = 1.5; break;
                case "D0" : point = 1.0; break;
                case "F" : point = 0.0; break;
            }
            
            scoreSum += credit * point;
            creditSum += credit;
        }

        System.out.printf("%.6f\n", scoreSum / creditSum);
    }
}