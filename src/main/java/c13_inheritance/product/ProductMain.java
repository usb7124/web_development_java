package c13_inheritance.product;
/*
    c13_ inheritance 패키지 내부에 product 패키지 생성 ->
    ProductMain
    Product
    Item
 */
public class ProductMain {
    public static void main(String[] args) {

        //Item의 객체 생성
        Item item1 = new Item("일반 상품", "일반 카테고리");
//        item1.displayInfo();                // 오류 발생
//        item1.setStock(10);                 // 오류 발생
        // 이상의 코드가 오류가 난다는 점에서 알 수 있는 점 :
        // 자식인 부모의 필드 및 메서드를 사용할 수 있으니,
        // 부모 클래스의 객체는 자식 클래스의 필드 및 메서드를 사용할 수 없음.
        // 실행 예
        // 이 상품은 일반 상품입니다.
        // 이 상품은 일반 카테고리입니다.    -> getter를 활용하여 해당 출력문이 콘솔에 나오도록
                                            // 작성하시오.   -> ProductMain에 작성하세요.
        System.out.println("이 상품은 " + item1.getName() + "입니다.");
        System.out.println("이 상품은 " + item1.getCategory() + "입니다.");

        // Product 객체를 생성하세요.
        // 전자 제품, 가전, 100000, 10로 생성하고, displayInfo()를 통해서 콘솔에 정보를 출력하세요.
        Product product1 = new Product("전자 제품", )
        // product1의 이름을 "가전 제품"으로 바꾸고, getName을 통해 바뀐 것을 콘솔창에 출력하시오.
    }
}
