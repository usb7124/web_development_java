package c16_object_classes;

import java.lang.reflect.Field;

public class TeacherMain {
    public static void main(String[] args) {
//        System.out.println(teacher1.getClass() == teacher2.getClass()); // true - 각 객체가 동일한 클래스에서 생성된 객체인지 확인
//        System.out.println(teacher1 instanceof Teacher);    // true - teachs1이 Teacher2


//        System.out.println(teacher3 instanceof Teacher);
        // 이상의 코드의 경우 Teacher가 .equals_test 패키지에 있는 클래스가 아니라
        // c16_object_classes에 있기 때문에 오류 발생함
//
//        System.out.println(teacher1.getClass() == Teacher.class);   // true
//        System.out.println(teacher2.getClass() == Teacher.class);   // true
//        System.out.println("teacher3에 대한 정보입니다");
//        System.out.println(teacher2.getClass() == Teacher.class);   // 위와 동일한 이유로 오류 발생
   }
}
