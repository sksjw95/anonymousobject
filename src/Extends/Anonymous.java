package Extends;

public class Anonymous {
    // 익명 객체를 필드 초기값으로 대입
    Person field = new Person(){
        void work(){
            System.out.println("출근");
        }
        @Override
        void wake(){
            System.out.println("6시에 일어난다.");
            work();
        }
    };
    void method1(){
        // 익명 객체를 로컬 변수값으로 대입
        Person localVar = new Person(){
            void walk(){
                System.out.println("산책 한다.");
            }
            @Override
            void wake(){
                System.out.println("7시에 일어난다.");
                walk();
            }
        };
        // 로컬 변수 사용
        localVar.wake();
    }
    void method2(Person person){
        person.wake();
    }
}
