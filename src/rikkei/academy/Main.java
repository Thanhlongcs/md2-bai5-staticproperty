package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3", "skyactic 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("mazda 6", "skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
