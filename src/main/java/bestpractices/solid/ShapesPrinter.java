package bestpractices.solid;


import java.util.List;

public class ShapesPrinter {

    /*
        Dependency Inversion Principle broken
        private AreaCalculator areaCalculator = new AreaCalculator();
     */
    // Fixing Dependency Inversion Principle
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    /*
        Fixing Single Responsibility Principle
     */
    public String json(List<Shape> shapes) {
        return String.format("{sum: %s}", areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return String.format("sum,%s", areaCalculator.sum(shapes));
    }
}
