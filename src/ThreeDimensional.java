/**
 * Created on 06-Mar-16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class ThreeDimensional extends Shape {
    public final double x;
    public final double y;
    public final double z;

    public ThreeDimensional(double x, double y, double z, String type) {
        super(type);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() {
        return x* y;
    }

    public double volume() {
        return x* y* z;
    }

 }
