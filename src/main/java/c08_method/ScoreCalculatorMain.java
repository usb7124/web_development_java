package c08_method;

import java.util.Scanner;

public class ScoreCalculatorMain {
    public static void main(String[] args) {
        // Scanner Import
        Scanner scanner = new Scanner(System.in);
        // ScoreCalculator를 import -> 클래스명 객체명 = new 클래스명();    -> constructor
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int totalSubject = 0;
        double score1 = 0;
        //
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;

        // 2. 점수를 누적적으로 더할 수 있게끔 작성하는 방식의 프로그해밍
        while (!endOfCalc) {        //
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if (score1 == -1) {
                break;        //switch문에서 배운 break문으로 : 반복문 종료할 때 쓰임 -> 곧장 반복문을 종료시키고자 할 때 쓰임
//                score1 += 1;
//                endOfCalc = true;
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score1);
            totalSubject++;
            // test code 삽입
//            System.out.println("총 점은" + totalScore + "점입니다.\n현재 과목의 수는 " + totalSubject + "개 입니다.");
            // 점수를 입력할 때마다 점수와 평균을 확인하기 위해 while문 내부로 해당 코드 옮김
            System.out.println("-------- 입력시 마다 나오는 합계와 평균입니다 --------");
            if (totalSubject > 0) {
                avgScore = scoreCalculator.calculateAvg(totalScore, totalSubject);
                System.out.println("입력한 점수의 합계 : " + totalScore + "\n입력한 점수의 평균 : " + avgScore);
            } else {        // totalSubjects <= 0인 경우
                System.out.println("입력한 점수가 없습니다.");
            }
        }

        // 분모가 0이면 예외가 발생하기 때문에, totalSubject가 0 초과일 때만 실행되도록 조건문 설정 -> 예외처리의 고전적 방법
//        System.out.println("-------- 최종으로 한 번만 나오는 합계와 평균입니다 --------");
//        if (totalSubject > 0) {
//            avgScore = scoreCalculator.calculateAvg(totalScore, totalSubject);
//            System.out.println("입력한 점수의 합계 : " + totalScore + "\n입력한 점수의 평균 : " + avgScore);
//        } else {        // totalSubjects <= 0인 경우
//            System.out.println("입력한 점수가 없습니다.");
//        }










    }
}
