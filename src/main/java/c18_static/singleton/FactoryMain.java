package c18_static.singleton;
/*
    싱글톤 패턴(Singleton Pattern)
        : 소프트웨어 '디자인 패턴' 중 하나로, 어떤 클래스가 하나의 인스턴스만 갖도록 보장하고,
        그 ㅇ친스턴스에 접근할 수 있는 전역적인 접근법을 제공하는 패턴. 예를 들어, 데이터 베이스 연결과 같은
        리소스는 프로그램 전체에서 하나의 인스턴스만 사용해야 할 때가 많기 때문에 싱글톤 패턴이 유용함.
    싱글톤 패턴의 특징
        1. 하나의 인스턴스만 존재 : 하나의 인스턴스만 생성되고, 이 인스턴스는 프로그램이 실행되는 동안 유지
        2. 전역 접근법 : 싱글톤 인스턴스는 '정적(static) 메서드'를 통하여 어디서든 접ㅂ근할 수 있음.
            -> 객체명.메서드명()x / 클래스명.메서드명()o
            3. 인스턴스의 생명 주기 관리 : 클래스 자체가 인스턴스 생성을 구ㅏㄴ리하므로, 다른 객체들이 직접
                인스턴스를 생성하거나 폐기할 수 없음.

    싱글톤 패턴의 장점 :
        1. 메모리 절약 : 불필요한 인스턴스 생성을 방지하여 메모리를 절약할 수 있음.
        2. 글로벌(전역적) 접근 : 전역적으로 접근할 수 있어 관리가 용이 -> 하지만 잦은 접근 자체는 단점
        3. 일관성 유지 : 애플리케이션 전반에서 하나의 인스턴스만
 */
public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        SmartPhone smartPhone1 = factory1.produceSmartPhone();  // 또 새로운 방식으로 객체 생성했습니다.
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();

        // smartPhone1의 경우 SmartPhone 클래스의 객체인데(참조자료형인데). 왜 sout(smartPhone1)했는데
        // 주소값이 아니라 필드가 다 튀어나올까요? -> SmartPhone 클래스의 @ToString 애너테이션 때문에
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);
    }
}
