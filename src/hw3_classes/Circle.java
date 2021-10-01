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
        if (hryvnia < 0 || kop < 0) {
            throw new IllegalArgumentException("Money Values should be >= 0");
        }
        this.hryvnia = hryvnia;
        this.kop = kop;
    }

    Money() {

    }

    public void setHryvnia(long hryvnia) {
        if (hryvnia >= 0) {
            this.hryvnia = hryvnia;
        } else throw new IllegalArgumentException("Hryvnia value should be >=0");
    }

    public void setKop(byte kop) {
        if (kop >= 0) {
            this.kop = kop;
        } else throw new IllegalArgumentException("Kop value should be >=0");
    }

    public double getSumUAH() {
        return this.sumUAH = (double) (this.hryvnia * 100 + this.kop) / 100;
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
        if (Money.compare(sum2, new Money(0L, (byte) 0)) == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return sum1.getSumUAH() / sum2.getSumUAH();
    }

    /**
     * @return Method returns "0" when entered values are equal,
     * "1" - when the 1st value > value2,
     * "-1" - when value1 < value2
     */
    public static int compare(Money sum1, Money sum2) {
        return Double.compare(sum1.getSumUAH(), sum2.getSumUAH());
    }
}

