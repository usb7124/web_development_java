package c08_method;

import java.util.Scanner;

public class Method02 {
    /*
        main 매서드에서 매뉴를 정의한 1~4까지의 별찍기 매서드 구현
     */
    public static String getStar(int menuSelect, int totalLine) {
        String result = "";

        // 번호의 값의 따라 다른 반복문이 실행되어야 함. -> 조건문 사용
        if (menuSelect == 1) {
            //왼쪽으로 치우친 증가하는 별
            for (int i = 0; i < totalLine; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (menuSelect == 2) {
            // 오른쪽으로 치우친 증가하는 별
            for (int i = 0; i < totalLine; i++) {
                //공백 삽입하는 실행문 2-1
                for (int j = 0; j < totalLine - i - 1; j++) {
                    result += " ";
                }
                // 별 삽입하는 실행문 2-2
                for (int k = 0; k < i + 1; k++) {
                    result += "*";
                }
                // 계행하는 실행문3
                result += "\n";
            }
        } else if (menuSelect == 3) {
            // 왼쪽으로 치우친 감소하는 별
            for (int i = 0; i < totalLine; i++) {
                for (int j = 0; j < totalLine - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (menuSelect == 4) {
            // 오른쪽으로 치우친 감소하는 별
            for (int i = 0; i < totalLine; i++) {
                //공백을 삽입하는 실행문 2-1
                for (int j = 0; j < i; j++) {
                    result += " ";
                }
                // 별을 삽입하는 실행문 2-2
                for (int k = 0; k < totalLine - i; k++) {
                    result += "*";
                }
                // 계행하는 실행문3
                result += "\n";
            }
        } else {
            System.out.println("잘못된 입력입니다");
        }
            return result;




    }

    public static void main(String[] args) {
        // 별찍기를 매서드 형태로 구현할 예정입니다.
        // 사용할 클래스 import
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 선언
        int rowOfStars = 0;
        int choice = 0;


        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.println("메뉴 선택 : ");
        choice = scanner.nextInt();
//        // 4 초과로 입력했을 경우에만 이하의 코드가 실행됨
//        if (choice > 4) {
//            System.out.println("다시 메뉴를 선택하세요 >>> ");
//            choice = scanner.nextInt();
//        }
//
//        // 1 미만으로 입력 했을 경우에만 이하의 코드가 실행됨
//        if (choice < 1) {
//            System.out.println("다시 메뉴를 선택하세요 >>> ");
//            choice = scanner.nextInt();
//        }

        // 그런데 OR이 돈다고 수강생분이 말씁해주셔서 개선합니다
//        if (choice > 4 || choice < 1) {
//            System.out.println("다시 메뉴를 선택하세요 >>> ");
//            choice = scanner.nextInt();
//        }

        // 이상의 코드의 문제점은 choice가 범위를 벗어났을 때 한번만 실행됨
        while (choice < 1 || choice > 4) {
            System.out.println("다시 메뉴를 선택하세요 >>> ");
            choice = scanner.nextInt();
        }

        System.out.println("별의 줄 수 입력 : ");
        rowOfStars = scanner.nextInt();

        System.out.println("[ 호출하신 결과입니다 ]");

        String stars = getStar(choice, rowOfStars);

        System.out.println(stars);
    }

}
