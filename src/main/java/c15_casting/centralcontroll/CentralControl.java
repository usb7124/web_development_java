package c15_casting.centralcontroll;

public class CentralControl {

    // 필드 선언
    private Power[] deviceArray;        // 필드를 배열로 선언한 경우가 처음이기 때문에
                                        // 좀 주목해서 보도록 하겠습니다.

    // 매개변수 생성자 만드세요

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main에 각 클래스의 객체를 하나씩 생성하세요 -> CentralControl제외
    // Computer computer1 = new Computer();

    // 전자제품들을 배열에 CentralControl의 객체의 필드인 배열에 추가해주는 메서드
    public void addDevice(Power device) {
        // cheakEmpty()는 좀 있다가 정의할 예정입니다
        // 개발 환경에서는 만들다보면 추가적으로 메서드 구현이 필요한 경우가 있어
        // 일부러 cheakEmpty()를 먼저 작성한 후 addDevice()를 작성하는게 아니라
        // 순서를 지금과 같이 하게 되었습니다.

        int emptyIndex = cheakEmpty();  // cheakEmpty()의 리턴값이 addDevice에서 이용되는 '함수형 프로그래밍'

        if (emptyIndex == -1 ) {  // java에서는 마이너스인덱스 개념이 없기 때문에 cheakEmpty()
                                  // 메서드에서 -1을 반환시킨 이유는
                                  // 비어있는 배열이 없다는 의미이기 때문에 다음과 같이 작성했습니다.
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;             // 해당 메서드를 종료한다는 의미로 return;을 사용함 ';'에 주목
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName());
        // 객체명.getClass -> 패키지 명을 포함한 클래스명이 출력됨
        // 객체명.getClass().getSimpleName() -> 클래스명만 출력
    }

    public int cheakEmpty() {       // 비어있는 배열에 index를 반환할 거기 때문에
                                    // 그리고 그 비어있는 배열의 index에 addDevice()를 통해
                                    // 새로운 전자 제품을 등록하는 방식으로 코딩할 예정
        // 배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스로 리턴할 예정
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {    // deviceArray[i]에 값이 없다면
                return i;
            }
        }
        return -1;
    }

    // 배열 내부에 있는 elements들의 전원을 전부 켜고, 끄는 메서드를 구현
    public void powerOn() {
        // 배열 내부에 있는 요소들(객체들 - Power의 자식 클래스들의 객체)의 공통된 메서드인 .on()을
        // 실행시킬 예정입니다.
        // 해당 경우에 생겨날 수 있는 문제점 :
        //      특정 배열 인덱스 내에 아무 객체가 없다면 .on()을 적용시켰을 경우 컴파일 에러가 나기
        //      때문에 해당 부분을 감안한 코드를 작성합니다.
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                // 특정 인덱스 넘버의 element가 null값이라면
                continue;       // 해당 반복문파트는 종료하고 다음 반복문 인덱스로 넘기겠다는 의미
            }
            deviceArray[i].on();        // continue가 실행되지 않았다면 해당 라인의 코드가
                                        // 실행되도록 작성
        }
    }
    // 전원 버튼을 끄는 메서드 poweroff()을 구현하세요.
    public void poweroff() {
        // 반복문 돌면서 비어있으면 지나가고, 아니면 꺼야 함.
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                continue;
            }
            deviceArray[i].off();
        }
    }



}