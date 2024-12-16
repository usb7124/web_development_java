package c18_static.singleton.databases;

public class DataManager {
    // 싱글톤 인스턴스를 가져와서 데이터베이스 연산을 수행하는 메서드만 정의할 예정입니다
    // -> 일잔적인 경우 이런 클래스를 Service 클래스라고 합니다.

    public void performDatabaseOperations() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        System.out.println("데이터베이스 연산을 수행 중");

        // 데이터베이스 연산 작업 후 연결을 닫는
        databaseConnection.closeConnection();
    }
}
