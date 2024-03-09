public class Circle implements Figure, Rotable, Drawable {

    private double side;

    public Circle() {
    }

    public Circle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double result = side * side;
        return result;
    }

    @Override
    public void rotable() {
        System.out.println("Rotating the circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
