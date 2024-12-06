package c09_classes;
/*
    학번, 이름, 점수(ABCDF) field를 선언합니다.
    기본 생성자
    학번을 매개변수로 하는 생성자
    이름을 매개변수로 하는 생성자
    학번, 이름, 점수를 매개변수로 하는 생성자

    showInfo() 매서드를 정의
    학번 : 12345
    이름 : 이일
    점수 : A 등급

 */

public class Student {
    // 필드 선언
    int sNum = 0;
    String sName;
    String grade;
    // 생성자 선언
    // 기본 생성자
    Student() {}

    // 매개변수 생성자
    Student(int studentNumber) {
        this.sNum = studentNumber;
    }

    Student(String name) {
        this.sName = name;
    }

    Student(int sNum, String sName, String grade) {
        this.sNum = sNum;
        this.sName = sName;
        this.grade = grade;
    }

    // showInfo() 선언
    void showInfo() {
        System.out.println("학번 : " + sNum);
        System.out.println("이름 : " + sName);
        System.out.println("점수 : " + grade);
    }
}
