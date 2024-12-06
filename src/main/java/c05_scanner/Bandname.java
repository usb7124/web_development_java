package c05_scanner;

import java.util.Scanner;

public class Bandname {
    public static void main(String[] args) {

        // scanner class를 import -> 콘솔창에 입력하기 위해
        Scanner scanner = new Scanner(System.in);

        // 변수 선언 -> 초기화하지 않음
//        String name;
//        String age;
//        String school;
//        String mbti;
//
//        System.out.println("이름이 무엇입니까? >>> ");
//        // 변수 초기화
//        name = scanner.nextLine();
//        System.out.println("몇 살입니까? >>> ");
//        age = scanner.nextLine();
//        System.out.println("학교가 어디입니까? >>> ");
//        school = scanner.nextLine();
//        System.out.println("MBTI는 어떻게 됩니까? >>> ");
//        mbti = scanner.nextLine();
//
//        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n" + school + "에 재학 중이며, MBTI는 " + mbti + "입니다.");

        // pantsColor, lastFood 변수를 선언 -> String

        // 입력 받기 위한 안내문을 작성하고, 변수에 데이터를 대입하세요.
        // 지금 입은 하의 색깔이 무엇인가요?
        // 마지막으로 먹은 음식이 무엇인가요?

        // pantsColor와 lastFood를 이용하여 밴드 네임을 출력하세요
        // 당신의 밴드 이름은 그레이 시리얼입니다.

//        System.out.println("지금 입은 하의 색깔이 무엇인가요? >>> ");
//        String pantsColor = scanner.nextLine();
//        System.out.println("마지막으로 먹은 음식이 무엇인가요? >>> ");
//        String lastFood = scanner.nextLine();
//
//        System.out.println("당신의 밴드 이름은 " + pantsColor + " " + lastFood + "입니다.");

        // 2. 변수 선언 따로 초기화 따로
        String logo = """
                
                 _____ ___  _ ____  _____   ____  ____  _      _____ _____  _     _  _      _____ \s
                /__ __\\\\  \\///  __\\/  __/  / ___\\/  _ \\/ \\__/|/  __//__ __\\/ \\ /|/ \\/ \\  /|/  __/ \s
                  / \\   \\  / |  \\/||  \\    |    \\| / \\|| |\\/|||  \\    / \\  | |_||| || |\\ ||| |  _ \s
                  | |   / /  |  __/|  /_   \\___ || \\_/|| |  |||  /_   | |  | | ||| || | \\||| |_// \s
                  \\_/  /_/   \\_/   \\____\\  \\____/\\____/\\_/  \\|\\____\\  \\_/  \\_/ \\|\\_/\\_/  \\|\\____\\ \s
                                                                                                  \s
                
                """;



        String pantsColor;
        String lastFood;

        System.out.println(logo);
        System.out.println("지금 입은 하의 색깔이 무엇인가요? >>> ");
        pantsColor = scanner.nextLine();
        System.out.println("마지막으로 먹은 음식이 무엇인가요? >>> ");
        lastFood = scanner.nextLine();

        System.out.println("당신의 밴드 이름은 " + pantsColor + " " + lastFood + "입니다.");





    }
}
