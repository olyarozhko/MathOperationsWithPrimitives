package hw4_oop_in_java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> listShape = new ArrayList<Shape>();
        listShape.add(new Triangle(1, 1, 3, 4, 4, 2));
        listShape.add(new Rectangle(1, 1, 2, 4));
        listShape.add(new Circle(1, 3, 4));

        listShape.add(new SquarePyramid(1, 3, 4, 5, 8));
        listShape.add(new Cuboid(1, 3, 4, 5, 8, 4));
        listShape.add(new Sphere(3, 2, 2, 10));

        listShape.forEach(shape -> System.out.println(shape.toString()));
    }
}
