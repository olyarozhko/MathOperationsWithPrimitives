package hw4_oop_in_java;

public class Shape {
    protected Vertex vertex1, vertex2, vertex3;
    protected String type;


    Shape(int x, int y) {
        this.vertex1 = new Vertex(x, y);
    }

    Shape(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertex1 = new Vertex(x1, y1);
        this.vertex2 = new Vertex(x2, y2);
        this.vertex3 = new Vertex(x3, y3);

    }

    Shape(int x, int y, int z) {
        this.vertex1 = new Vertex(x, y, z);
    }


    public static class Vertex {
        protected int x, y, z;

        Vertex(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Vertex(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}

abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected double perimeter, area;

    PlaneShape(int x, int y) {
        super(x, y);
    }

    PlaneShape(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public String toString() {
        return String.format("Shape type: %s \nVertex: %d, %d \nArea: %.2f \nPerimeter: %.2f\n",
                this.type, this.vertex1.x, this.vertex1.y, this.getArea(), this.getPerimeter());
    }

}

abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    SpaceShape(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public String toString() {
        return String.format("Shape type: %s \nVertex: %d, %d, %d \nArea: %.2f \nVolume: %.2f\n",
                this.type, this.vertex1.x, this.vertex1.y, this.vertex1.z, this.getArea(), this.getVolume());
    }

}


class Triangle extends PlaneShape {
    private final double side1;
    private final double side2;
    private final double side3;

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
        this.side1 = getSide(this.vertex1, this.vertex2);
        this.side2 = getSide(this.vertex2, this.vertex3);
        this.side3 = getSide(this.vertex1, this.vertex3);
        this.type = "Triangle";
    }

    public double getSide(Vertex vertex1, Vertex vertex2) {
        return Math.sqrt(Math.pow((vertex1.x - vertex2.x), 2) + Math.pow((vertex1.y -
                vertex2.y), 2));

    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    @Override
    public String toString() {
        return String.format("Shape type: %s \nVertex1: %d, %d \nVertex2: %d, %d \nVertex3: %d, %d \nArea: %.2f " +
                        "\nPerimeter: %.2f\n",
                this.type, this.vertex1.x, this.vertex1.y, this.vertex2.x, this.vertex2.y, this.vertex3.x,
                this.vertex3.y, this.getArea(), this.getPerimeter());
    }
}

class Rectangle extends PlaneShape {
    private final int width;
    private final int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.type = "Rectangle";

    }

    @Override
    public double getPerimeter() {
        return this.perimeter = 2 * (this.height + this.width);
    }

    @Override
    public double getArea() {
        return this.area = this.height * this.width;
    }

}

class Circle extends PlaneShape {
    private final double radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        if (radius > 0) {
            this.radius = radius;
        } else throw new IllegalArgumentException("Radius can't be <= 0");
        this.type = "Circle";
    }


    @Override
    public double getPerimeter() {
        return this.perimeter = 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return this.area = Math.PI * Math.pow(this.radius, 2);
    }
}

class SquarePyramid extends SpaceShape {
    private final int baseWidth;
    private final int height;

    SquarePyramid(int x, int y, int z, int baseWidth, int height) {
        super(x, y, z);
        this.baseWidth = baseWidth;
        this.height = height;
        this.type = "SquarePyramid";
    }

    @Override
    public double getArea() {
        double d = Math.sqrt(2 * Math.pow(this.baseWidth, 2));
        double side = Math.sqrt(Math.pow(this.height, 2) + Math.pow(d, 2));
        return Math.pow(this.baseWidth, 2) + 2 * this.baseWidth * Math.sqrt(Math.pow(side, 2) -
                Math.pow(this.baseWidth, 2) / 4);
    }

    @Override
    public double getVolume() {
        return (double) this.height / 3 * Math.pow(this.baseWidth, 2);
    }

}

class Cuboid extends SpaceShape {
    private final int width;
    private final int height;
    private final int depth;


    Cuboid(int x, int y, int z, int width, int height, int depth) {
        super(x, y, z);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.type = "Cuboid";
    }

    @Override
    public double getArea() {
        return 2 * (this.width * this.height + this.height * this.depth + this.width * this.depth);
    }

    @Override
    public double getVolume() {
        return this.width * this.height * this.depth;
    }

}

class Sphere extends SpaceShape {
    private final int radius;


    Sphere(int x, int y, int z, int radius) {
        super(x, y, z);
        if (radius > 0) {
            this.radius = radius;
        } else throw new IllegalArgumentException("Radius can't be <= 0");
        this.type = "Sphere";
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(this.radius, 3) / 3;
    }

}

//Interfaces needed for the classes

interface PerimeterMeasurable {
    double getPerimeter();
}

interface AreaMeasurable {
    double getArea();
}

interface VolumeMeasurable {
    double getVolume();
}