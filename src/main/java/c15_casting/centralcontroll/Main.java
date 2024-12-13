package c15_casting.centralcontroll;
/*
    centralcontroll
    power 인터페이스
    Main 클래스
 */
public class Main {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();
        Tv tv1 = new Tv();
        CentralControl centralControl = new CentralControl(new Power[5]);
        // 마찬가지로 new CentralControl생성자의 argument로 다시 생성자인데 -> 그마저도 배열 참조 자료형 캐스팅
    }
}
