/**
 * Created by putkanka on 06-Mar-16.
 */
public class TwoDimensional extends Shape {
    private double x;
    private double y;

    public TwoDimensional(double x, String type) {
        super(type);
        this.x = x;
    }

    public TwoDimensional(double x, double y, String type) {
        super(type);
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    @Override
    public double area() {
        return x() * y();

    }
}
