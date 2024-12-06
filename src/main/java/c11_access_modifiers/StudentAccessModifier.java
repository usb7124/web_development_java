package c11_access_modifiers;
/*
    접근지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데 사용됨.

        종류 :
            1)  public : 모든 클래스에서 접근할 수 있음
            2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은
                자식 클래스에서 접근 가능
            3) default(package-private) : 접근 지정자를 명시하지 않으면
                 default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능
            4) private: 같은 클래스 내에서만 접근 가능
 */
public class StudentAccessModifier {
    private int studentCode;
    private String studentName;
    private double studentAvg;

    // 기본 생성자 / 매개 변수 생성자 전부 선언하세요.
    public StudentAccessModifier () {}

    public StudentAccessModifier(int studentCode) {
        this.studentCode = studentCode;
    }

    public StudentAccessModifier(String studentName) {
        this.studentName = studentName;
    }

    public StudentAccessModifier(double studentAvg) {
        this.studentAvg = studentAvg;
    }

    public StudentAccessModifier(int studentCode, String studentName, double studentAvg) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentAvg = studentAvg;
    }

    // 필드 별 Setter / Getter 선언하세요
    public void setStudentCode(int StudentCode){
        this.studentCode = StudentCode;
    }

    public void setStudentName(String StudentName) {
        this.studentName = StudentName;
    }

    public void setStudentAvg(double StudentAvg) {
        this.studentAvg = StudentAvg;
    }

    public void getStudentCode() {

    }

    public void getStudentName() {

    }

    public void getStudentAvg() {

    }

    public void showInfo() {
        System.out.println("");
    }



    // 기본 생성자를 통해 StudentAccessModifierMain에 student1 객체를 생성하세요

    // 학번에 20241205, 이름에 여러분 성함, 평균에 100.0을 대입하세요.

    // showInfo() 메서드를 public으로 정의하세요
    // 실행 예
    // 안근수 학생의 학번은 20241205이며, 평균 점수는 100.0점입니다.
}
