package c16_object_classes;

import java.util.Objects;

public class Student {
    /*
        1. Student 클래스에 학생의 이름(name)과, 학번(studentId)를 저장하는 필드를 작성하세요.
        2. equals(), hashCode() 메서드를 재정의하여 학생 객체들이 같은지 여부를 이름과 학번으로 비교하도록 작성하세요.

        지시 사항

            1. Student 클래스는 name과 studentId를 private 접근 지정자로 가지고 있어야 함.
            2. AllArgsConstructor로 생성자를 만들어야 함.
                - student1 - name = "안근수" / studentId = 20241213
                - student1 - name = "박승주" / studentId = 20240000
            3. equals() 메서드를 오버라이드하여, 두 학생 객체가 이름과 학번이 모두 같으면 true를 반환하도록 구현해야 함.
            4. hashCode() 메서드를 오버라이드하여, 이름과 학번을 기반으로 한 해시코드를 반환하도록 구현해야 함.
            5. 각 필드별로 getter와 setter를 구현해야 함.
            6. Student 클래스를 활용하여, 학생 객체를 생성하고 toString() 메서드를 이용해 학생의 이름과 학번을 포함한
                모든 정보를 출력하는 예제를 작성하시오
     */

    // 지시사항 1번 - 필드
    private String name;
    private int studentId;

    // 지시사항 2번 - 전체 매개변수 생성자

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // 지시사항 3번 - 메서드
    // 지시사항 4번 - 메서드

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    // 지시사항 5번 - 메서드들

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    // 지시사항 6번 - 메서드
    // 재정의 한 번 해보겠습니다.
    @Override
    public String toString() {
        return "해당 학생의 이름은 " + name + "이고, 학번은 " + studentId + "입니다.";
    }
}
