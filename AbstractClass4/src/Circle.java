public class Circle extends Figure {

    private double side;

    public Circle() {
    }

    public Circle(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double result = side * side;
        return result;
    }
}
