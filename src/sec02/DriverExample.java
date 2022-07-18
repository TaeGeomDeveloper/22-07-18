package sec02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        System.out.println(bus);
        driver.drive(bus);
        System.out.println(taxi);
        driver.drive(taxi);

        Vehicle vehicle = new Car();
        vehicle.run();

        // 강제 타입 변환
        Car car = (Car) vehicle;
        car.run();
        car.checkFare();
    }
}
