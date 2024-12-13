package c17_bean;
/*
    Lombok
        자바에서 반복적으로 작성해야 하는 코드(boilerplate code:보일러플레이트 코드)를
        자동으로 생성해주는 라이브러리

        장점 :
            코드의 가독성을 높일 수 있다 -> 주석을 통한 애너테이션을 붙여 코드 생성을 제어 가능
                특히 스크롤링해서 setter가 있는지 없는지, 특정한 field에 대한 setter/getter의
                유무 들을 고려할 필요가 없어 @ 파트만 보더라도 대략적인 코드 흐름을 알 수 있음.

        1. @Data
            - @Getter, @Setter,
                애너테이션들을 포함한 종합 패키지에 해당
        2. @NoArgsConstructor
            - 기본 생성자를 생성
        3. @AllArgsConstructor
            - final 또는 @NonNuLL로 지정된 모든 필드를 매개변수로 받는 생성자를 생성합니다.
            - 초기화를 강제하기 위한 수단으로 쓰입니다
        4. @Getter / @Setter
            - 각 필드에 대해 getter setter 메서드들을 생성
            - 클래스 레벨에 사용하면 모든 필드에 대해, 필드 레벨에 사용하면 특정 필드에 대해서만
                getter와 setter가 생성됨 -> 저희는 예시로 보여드렸을 때 클래스 레벨에만 적용했었습니다.
            - 단 @Setter 기준으로 final 필드에는 Setter가 생성되지 않습니다.

        5. @EqualAndHashCode
            - equals
 */
import lombok.Data;

@Data
public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;
}
