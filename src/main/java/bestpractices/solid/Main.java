package bestpractices.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        /*
            Liskov Substitution Principle
         */
        Shape noShape = new NoShape();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(cube);
//        shapes.add(noShape);
//        int areaSum = areaCalculator.sum(shapes);
//        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        ShapesPrinter printer = new ShapesPrinter(areaCalculatorV2);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
