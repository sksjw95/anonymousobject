package Interface;

public class Anonymous2 {
    // 필드 초기값으로 대입
    RemoteCtrl field = new RemoteCtrl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 킨다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끈다.");
        }
    };
    void method(){
        // 로컬 변수값으로 대입
        RemoteCtrl localVar = new RemoteCtrl() {
            // 로컬 변수 선언과 초기값 대입
            @Override
            public void turnOn() {
                System.out.println("Audio를 킨다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio를 끈다.");
            }
        };
        // 로컬 변수 사용
        localVar.turnOn();
        localVar.turnOff();
    }
    void method2(RemoteCtrl rc){
        rc.turnOn();
        rc.turnOff();
    }

}
