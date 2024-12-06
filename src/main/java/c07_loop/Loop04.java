package c07_loop;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            while문

            형식 :
            while(조건문) {
                실행문
            }
         */

//        int sum = 0;
//        for(int i = 0; i < 6; i++) {
//            sum += i;
//        }
//        System.out.println("1부터 5까지의 합 : " + sum;

//        int sum2 = 0;
//        int i = 0;
//        // while문을 활용한 1 ~ 5까지의 합 코드
//        while (i < 6) {
//            sum2 += i;
//            System.out.println(sum2);
//            i++;            // i를 증가시켜서 무한루프에서 탈출시키고 합을 구하기 위함
//        }
//        System.out.println("최종 합계 : " + sum2);
//
//        System.out.println("i의 최종 값 : " + i);

        /*
            이상의 for문과 while문에서 확인할 수 있듯이
            for문의 경우 :
                한계값을 설정하기 때문에 정확한 반복 횟수를 알 수 있음
                    -> 반복 횟수를 고정시킬 수 있을 때 주로 사용
            while문의 경우 :
                외부에서 변수를 선언한 다음에 강제로 증가시키는 편이기 때문에
                횟수를 고정한 반복문에는 덜 적절함.
                대신, 특정 조건을 만족하는지 아닌지와 같이 횟수와 관계 없는 경우
                while 반복문이 사용됨
         */
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        boolean continued = true;
        boolean endOfGame = false;

        // 범용적이고 읽기 쉬운 코드를 쓰기 위한 습관을 들이는 것이 중요합니다.
        // 그런데 초심자들의 경우 해당 코드가 읽기가 어려운 경우도 물론 존재하기 때문에
        // 차근차근 익숙해지도록 하겠습니다
        while(!endOfGame) {
            System.out.println("계속하시겠습니까? >>> ");
            answer = scanner.nextInt();
            if (answer == 1) {
                endOfGame = true;
            }
        }

        while(continued) {
            System.out.println("계속하시겠습니까? >>> ");
            answer = scanner.nextInt();
            if (answer == 1) {
                continued = false;
            }
        }
    }
}
