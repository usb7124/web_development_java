    package c09_classes;
    /*
        ClassA에 적은 내용을 바탕으로 Car 클래스를 정의함.
     */
    public class Car {
        // 속성
        String color;
        int speed;

        // 행동(매서드)
        void drive() {
            System.out.println("자동차가 주행 중입니다");
        }

        void stop() {
            System.out.println("자동차가 멈췄습니다");
        }

        // 1. CarMain.java로 가서 -> myCar라는 객체 생성하세요.
        // 2. myCar의 color에 "빨강"을 대입하세요
        // 3 yourCar 라는 객체를 생성하시고 color에 "노랑"을 대입하세요.
        // 4. myCar에서 drive() 매서드를, yourCar에서 stop() 매서드를 호출하세요.
    }
