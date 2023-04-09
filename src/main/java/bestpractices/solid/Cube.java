package bestpractices.solid;

 /*
    Interface segregation Principle solution
 */
public class Cube implements Shape, ThreeDimensionalShape {

    private final int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
}
