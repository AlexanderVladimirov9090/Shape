/**
 * Created by zumbaa on 06/03/16.
 */
public class Sphere extends ThreeDimensional {

    public Sphere(double radius) {
        super(radius, "Sphere");
    }

    public double radius() {
        return x();
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius(), 3);
    }

    @Override
    public double volume() {
        return 4 / 3 * Math.PI * Math.pow(radius(), 3);
    }
}
