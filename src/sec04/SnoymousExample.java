package sec04;

public class SnoymousExample {
    public static void main(String[] args) {
        Anoymous anony = new Anoymous();
        // 익명 객체 필드 사용
        anony.field.wake();
        // 익명 객체 로컬 변수 사용
        // 메소드 사용
        wake(new Anoymous());
        // 익명 객체 매개값 사용
        anony.method2(
                new Person() {
                    void study() {
                        System.out.println("공부합시다.");
                    }

                    @Override
                    void wake() {
                        System.out.println("8시에 일어납니다.");
                        study();
                    }
                }
        );
        // 자동 타입 변환
        Person p = new TaeGeom();
        p.wake();
        // 강제 타입 변환
        TaeGeom tg = (TaeGeom) p;
        tg.wake();
    }
    public static void wake(Anoymous annony){
        annony.method1();
    }

}
