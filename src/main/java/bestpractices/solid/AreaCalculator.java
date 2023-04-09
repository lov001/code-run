package bestpractices.solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
           /*
           Fixing Open Closed Principle
           if (shape instanceof Square) {
                sum += ((Square) shape).getSide() * ((Square) shape).getSide();
            } else if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            */


            /*
            Violation of Open Closed Principle
            else if (shape instanceof Cube) {
                sum += 6 * Math.pow(((Cube) shape).getSide(), 2);
            }*/
        }
        return sum;
    }

    /*
    Violation of Single Responsibility Principle
    public String json(int sum) {
        return String.format("{sum: %s}", sum);
    }

    public String csv(int sum) {
        return String.format("sum,%s", sum);
    }
    */
}
