public class Square extends Figure {

    double radius;

    public Square() {
    }

    public Square(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double result = Math.PI * (radius* radius);
        return result;
    }
}
