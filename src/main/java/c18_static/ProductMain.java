package c18_static;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    // 필드 선언
    private String name;

    // 여기에 나오지는 않지만 getter와 setter가 정의됐습니다 -> 이것을 main 메서드 영역 내에서 객체 생성 및
    // 필드를 set하고, 그 값을 get할 수 있습니다.

    public static void main(String[] args) {
        System.out.println("현재 시리얼 넘버 : " + Product.autoIncrement);

        Product product1 = new Product("p1");

        System.out.println("현재 시리얼 넘버 : " + Product.autoIncrement);
        System.out.println("p1의 시리얼 넘버 : " + product1.getSerialNumber());

        Product product2 = new Product("p2");

        System.out.println("현재 시리얼 넘버 : " + Product.autoIncrement);
        System.out.println("p2의 시리얼 넘버 : " + product2.getSerialNumber());

        // 클래스명 객체명 = new 클래스명();   -> 여기서부터는 Product의 객체가 아니라 ProductMain의 객체입니다.
        ProductMain productMain1 = new ProductMain();
        /*
            productMain의 name에 "pm1"을 set하고, 콘솔창에 pm1이 나오도록 getter를 이용하세요
         */
        productMain1.setName("pm1");
        System.out.println(productMain1.getName());
    }
}
