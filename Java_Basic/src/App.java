import section01.Car;

public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("람보르기니","검정");
        car1.setGas(5);
        car1.setMaxSpeed(320);
        car1.run();
        car1.increaseSpeed();
    }
}
