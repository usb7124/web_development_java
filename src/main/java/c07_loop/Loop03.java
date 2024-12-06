package c07_loop;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        /*
            중첩 for 문(multiple for sentence)

            형식 :

            for(int i(index 인덱스) = 0 ; i < 10 ; i++) {
                (실행문1)                                              -> () optionel : 있어도 되고 없어도 되고
                for(int j = 0 ; j < 10 ; j++) {
                    실행문2
                }
                (실행문3)
            }
         */
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < 10; i++) {
//            a = i;
//            System.out.println("a의 값 : " + a);
//            for (int j = 0; j < 10; j++) {
//                b = j;
//                System.out.println("b의 값 : " + b);
//            }
//            System.out.println("---a의 값이 바뀌는 지점입니다.---");
//        }

        /*
            수자 하나를 입력 받아, 그 수자에 해당하는 구구단을 출력하시오.

            실행 예
            수자를 입력하세요 >>> 2
            2 x 1 = 2
            2 x 2 = 4
            ...
            2 x 9 = 18
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("수자를 입력하세요 >>> ");
//        int dan = scanner.nextInt();
        // 반복문 작성
//        for (int i = 1; i < 10; i++) {
//            int answer = dan * i;
//            System.out.println(dan + " x " + i + " = " + answer);
//        }
        /*
            구구단 출력

            실행 예

            2 x 1 = 2
            2 x 2 = 4
            ...
            2 x 9 = 18
            ----------------------
            3 x 1 = 3
            ...
            9 x 9 = 81
            ----------------------
         */
        // 2단부터 시작하기 때문에 int i = 2로 선언 및 초기화
        int answer = 0;
        for (int i = 2; i < 10; i++) {
            // 실행문1 없음
            for (int j = 1; j < 10; j++){
                // 실행문2
                answer = i * j;
                System.out.println(i + " x " + j + " = " + answer);
            }
            //실행문3
            System.out.println("-----------");
        }
    }
}
