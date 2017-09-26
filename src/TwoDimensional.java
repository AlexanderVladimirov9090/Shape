/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *             This is two dimensional shape class derived  from Shape.
 */
public class TwoDimensional extends Shape {
    public final double x;
    public final double y;


    public TwoDimensional(double x, double y, String type) {
        super(type);
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates area of shape.
     * @return area of shape.
     */
    @Override
    public double area() {
        return x * y;

    }
}
