    package c10_getter_setter;
    /*
        1. Setter / Getter의 필요성
            문제 상황
            클래스를 만든다고 가정해보겠습니다. 예를 들어, 사람(Person) 클래스를 만들면서
            이름(name), 나이(age) 등의 정보를 저작하기 위해 필드를 선언했습니다.

            class Person {
                String name;
                int age;
            }

            그리고 이를 PersonMain에서 객체를 생서앻ㅆ다고 가정하겠습니다.
            class PersonMain {
                public static void main(String90 args) {
                    Person person = new Person();   // 객체 생성
                    person.name = "안근수";
                    person.age = -10;   //의도적으로 이상한 나이 설정했습니다.
                }
            }
            해당 코드를 확인했을 때 나이에 정상적이지 않은 값이 대입돼있습니다.
            이처럼 외부에서 직접 접근이 가능했을 때 이상한 값이 들어가더라도 통제할 수 있는
            방법이 없는 문제가 있습니다. -> 이를 해결하기 위한 방법 : Setter / Getter 개념

            2. Setter / Getter란?

                Setter
                    데이터를 "설정"하는 역할을 하는 "method". 클래스 외부에서 필드를 직접 수정하지
                    못하도록 하고, 대신 특정 매서드를 통해 값을 전달받아 수정합니다.

                Getter
                    데이터를 "조회"하는 역할을 하는 "method". 클래스 외부에서 변수를 직접 읽지
                    못하도록 하고, 특정 메서드를 통해 안전하게 값을 반환합니다.

                    Person.java / PersonMain.java를 확인할 것 -> 응용코드 작성

                    수업 내용 확인을 위해 파일 내부를 겁색하려면 -> ctrl + f
                    여태까지 수업한 전체 패키지 및 파일 확인에서 내용을 확인 하려면
                    -> ctrl + shift + f

                    해결책 : 캡슐화(encapsulation)
                    클래스 내부의 데이터를 외부에서 바로 접근하지 못하게 하고, 대신
                    "메서드"를 통해서 간접적으로 접근하도록 만드는 것.

                    "이를 통해 데이터의 유효성을 검증하거나 특정한 로직을 추가"할 수 있습니다.

            3. Setter와 Getter의 장점
                1) 데이터 보호
                    변수에 private 접근 제어자를 사용하여 외부에서 직접 접근하지 못하게 함으로써
                    데이터를 보호할 수 있음
                2) 데이터 유효성 검증
                    Setter 메서드에서 입력된 데이터가 적합한지 확인하고, 잘못된 값을 거부할 수 있음.
                    (ex) 나이가 0보다 큰지 확인)
                3) 캡슐화 유지
                    데이터를 숨기고 필요한 경우에만 제한적으로 접근할 수 있게 하여 클래스 내부 구현을
                    외부에 노출하지 않음
                4) 유연성 증가
                    나중에 요구사항이 바뀌어 데이터를 설정하거나 조회하는 방법이 변경되더라도
                    클래스 내부의 메서드만 수정하면 되므로 유지 보수가 쉬워짐.

            4. 그래서 Setter / Getter는 언제나 필수적인가?
                모든 경우레 Setter / Getter가 필수적인것은 '아닙니다'
                하지만 일정 사이즈 이상의 프로젝트를 진행해서 다수의 데이터를 입력 받을 경우
                적절한 데이터임을 검증하는 과정을 명시하기 위해서는
                Setter / Getter를 이용하는 것이 '효과적'입니다.

                거의 대부분 사용하기 때문에 alt + insert 등을 지원하고
                추후 수업할 lombok 애너테이션을 사용하는 편입니다.
                이는 객체 지향 프로그래밍의 중요한 기초이며, 안전한 클린코드를 작성하는 과정이라는
                측면에서 매우 중요합니다.

     */
    public class GetterSetter {
    }