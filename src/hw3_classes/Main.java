package hw3_classes;

public class Main {
    public static void main(String[] args) {
        //Task1. A Circle
        System.out.println(String.format("\nTask1: circle square - %.2f", new Circle().circleSquare(4)));

        //Task2. A Car
        System.out.println("\n---------Task2. Car class:-------------");
        Car car = new Car();
        System.out.println(String.format("Is a car started: - %b", car.getCarStarted()));
        System.out.println(String.format("Current speed: - %d", car.getSpeed()));
        car.startCar();
        System.out.println(String.format("carStarted value, after a car was started: - %b", car.getCarStarted()));
        car.carRunsWithSpeed(60);
        System.out.println(String.format("The Car's Speed when it's running: - %d", car.getSpeed()));
        car.stopCar();
        System.out.println(String.format("The Car's Speed when it was stopped: - %d", car.getSpeed()));
        System.out.println(String.format("Is the car started?: - %b", car.getCarStarted()));


        //Task3. Money
        System.out.println("\n---------Task3. Money:-------------");
        Money sum1 = new Money(10L, (byte) 10);
        Money sum2 = new Money(15L, (byte) 5);


        System.out.println(String.format("SumUAH2: - %.2f", sum1.getSumUAH()));
        System.out.println(String.format("SumUAH2: - %.2f", sum2.getSumUAH()));
        System.out.println(String.format("Sum: - %.2f", Money.sum(sum1, sum2)));
        System.out.println(String.format("Subtraction: - %.2f", Money.subtraction(sum1, sum2)));
        System.out.println(String.format("Multiplication: - %.2f", Money.multiplication(sum1, sum2)));
        System.out.println(String.format("Division: - %.2f", Money.division(sum1, sum2)));
        System.out.println(String.format("Comparing: - %d", Money.compare(sum1, sum2)));

    }
}
