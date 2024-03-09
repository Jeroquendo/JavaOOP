public class Square implements Figure, Drawable {

    double radius;

    public Square() {
    }

    public Square(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double result = Math.PI * (radius* radius);
        return result;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
