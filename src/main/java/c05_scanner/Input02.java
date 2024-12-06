package c05_scanner;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("x 입력 : ");
//        int x = scanner.nextInt();
//        System.out.println("y 입력 : ");
//        int y = scanner.nextInt();
//        System.out.println("x + y = " + (x+y)); // 올바른 연산 출력
//        System.out.println("x + y = " + x+y); // x,y가 String 취급받아 틀린 연산 출력
        /*
            평균 계산기를 작성하시오

            지시 사항
            1. 사용자로부터 세 개의 실수를 입력받아, 이 수치들의 평균 및 합을 계산하고
            출력하시오.
            2. 사용자에게 첫 번째 실수를 입력받으세요
            3. 사용자에게 두 번째 실수를 입력받으세요
            4. 사용자에게 세 번째 실수를 입력받으세요
            5. 총합과 평균을 계산하고 출력하세요

            실행 예
            첫 번째 실수를 입력하세요 >>> 100
            두 번째 실수를 입력하세요 >>> 80
            세 번째 실수를 입력하세요 >>> 60


            총합 : 240.0
            평균 : 80.0
         */
        System.out.println("첫 번째 실수를 입력하세요 >>> ");
        double n1 = scanner.nextDouble();
        System.out.println("두 번째 실수를 입력하세요 >>> ");
        double n2 = scanner.nextDouble();
        System.out.println("세 번째 실수를 입력하세요 >>> ");
        double n3 = scanner.nextDouble();

        System.out.println("총합 : " + (n1 + n2 + n3));
        System.out.println("평균 : " + (n1 + n2 + n3) / 3);


    }
}
