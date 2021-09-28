package hw3_classes;

public class Circle {

    private double radius;

    public Double circleSquare(double radius) {
        if (radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        }
        throw new IllegalArgumentException("Radius can't be <= 0");
    }
}

class Car {
    private int speed = 0;
    private boolean carStarted;

    public int getSpeed() {
        return speed;
    }

    public boolean getCarStarted() {
        return carStarted;
    }

    public void startCar() {
        this.carStarted = true;
        System.out.println("A Car is started");
    }

    public void stopCar() {
        this.carStarted = false;
        this.speed = 0;
        System.out.println("A Car is stopped");
    }

    public void carRunsWithSpeed(int speed) {
        if (!carStarted) {
            throw new IllegalArgumentException("The Car isn't Started. Please, start it.");
        }

        if (speed <= 0) {
            throw new IllegalArgumentException("Speed can't be <= 0. Please, set a correct value.");
        }

        this.speed = speed;
        System.out.println("The Car is running with a speed " + speed + "km/h");
    }
}

class Money {
    private long hryvnia;
    private byte kop;
    private double sumUAH;

    Money(long hryvnia, byte kop) {
        this.hryvnia = hryvnia;
        this.kop = kop;
        this.sumUAH = calculateSumUAH();
    }

    Money() {

    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public void setKop(byte kop) {
        this.kop = kop;
    }

    public double calculateSumUAH() {
        if (this.hryvnia >= 0 || this.kop >= 0) {
            return this.sumUAH = (double) (this.hryvnia * 100 + this.kop) / 100;
        } else throw new IllegalArgumentException("Money Values should be > 0");
    }

    public double getSumUAH() {
        return sumUAH;
    }

    public byte getKop() {
        return kop;
    }

    public long getHryvnia() {
        return hryvnia;
    }

    public static double sum(Money sum1, Money sum2) {
        return sum1.getSumUAH() + sum2.getSumUAH();
    }

    public static double subtraction(Money sum1, Money sum2) {
        return sum1.getSumUAH() - sum2.getSumUAH();
    }

    public static double multiplication(Money sum1, Money sum2) {
        return sum1.getSumUAH() * sum2.getSumUAH();
    }

    public static double division(Money sum1, Money sum2) {
        return sum1.getSumUAH() / sum2.getSumUAH();
    }

    public static int compare(Money sum1, Money sum2) {
        return Double.compare(sum1.getSumUAH(), sum2.getSumUAH());
    }
}

