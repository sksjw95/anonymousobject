package Interface;

public class Main2 {
    public static void main(String[] args) {
        Anonymous2 anony = new Anonymous2();
        // 익명 객체 필드 사용
        anony.field.turnOn();
        anony.field.turnOff();
        // 익명 객체 로컬 변수 사용
        anony.method();
        // 익명 객체 매개값 사용
        anony.method2(new RemoteCtrl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTV를 킨다.");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTV를 끈다.");
            }
        });
    }
}
