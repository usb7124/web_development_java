    package c09_classes;
    /*
        생성자
        생성자는 객체가 생성될 때 호출되는 특별한 매서드

        ClassExample example = new ClassExample();에서 'new ClassExample()'이 생성자의 해당됨

        특징
        1. 클래스의 이름과 생성자의 이름은 동일하다 (즉, 다른 매서드들과 달리 대문자로 시작한다.)
        2. return 값이 없다. -> 마치 call1(), call2() 유형과 같은 식으로 받아드릴 수 있습니다.
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다.

        생성자의 정의 방식
        1. 기본 생성자 : 매개변수가 없는 생성자(사실 클래스를 만들 때 default로 생성되어 정의하지 않아도 될 때가 있음)
        2. 매개변수 생성자 : 하나 이상의 매개변수를 거치는 생성자
     */
    public class Constructor {
        // 필드(속성) 선언
        int num;
        String name;

        //기본 상속자를 직접 만들개 됐을 경우 // call1()의 형태가 됩니다.
        Constructor() {
            System.out.println("NoArgsConstructor(기본생성자)");
        }

        // 매개 변수 생성자 -> 기본적으로 만들어지지 않습니다. 개발자가 정의해야 함. call2() 형태가 됩니다.
        Constructor(int number) {
            System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
            this.num = number;  // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체되는 것.
                                // 즉, '이 객체의 num 필드에 number 데이터를 대입하겠다'는 의미가 됨.
                                // 여기서 여러분이 명심하셨으면 아는 바는 매걔변수 number와 맴버 변수 num과는
                                // 대입 연산자 = 전까지는 서로 다른 개념입니다.
        }

        // 매걔변수 생성자를 직접 만드세요 -> 매걔변수는 String title로 고정합니다.
        // 생성자가 호출될 때 RequiredArgsConstructor(String 매걔변수를 필수로 요구하는 생성자) 가 콘솔에 찍히도록 작성하세요.

        // 이후 ConstructorMain.java에서 Constructor constructor4 = new Constructor(김일)을 통해 객체를 생성하세요.
        // 김일 이름을 가진 객체의 필드에 20을 입력하고
        // 콘솔창에 constructor4의 name과 num을 출력하세요.

        Constructor (String title) {
            System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
            this.name = title;
        }

        // 복수의 매개변수를 이용하는 생성자
        Constructor(int num, String name) {
//            System.out.println("AllArgsConstructor(int, String 매개변수 모두를 요구하는 생성자)");
//            this.num = num;
//            this.name = name;
        }

        // field들이 전부 출력될 수 있는 method를 정의 해야만 함.
        void showinfo() {
            System.out.println("해당 객체의 num 값 : " + num);
            System.out.println("해당 객체의 num 값 : " + name);
        }

        public String toString() {
            return "해당 객체의 num 값 : " + num + "\n해당 객체의 name 값 : " + name;
        }




    }
