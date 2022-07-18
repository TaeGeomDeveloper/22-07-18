package sec02;

public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("차가 달립니다.");
    }
    public void checkFare(){
        System.out.println("승차요금 없음.");
    }

    @Override
    public String toString() {
        return "차가 출발합니다.";
    }
}
