package sec02;

public class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시 가 달립니다.");
    }

    public void checkFare(){
        System.out.println("승차요금을 체크.");
    }

    @Override
    public String toString() {
        return "택시가 출발합니다.";
    }
}
