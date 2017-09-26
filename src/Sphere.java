/**
 * Created on 06/03/16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Sphere extends ThreeDimensional {

    public Sphere(double radius) {
        super(radius, 0,0,"Sphere");
    }



    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(x, 3);
    }

    @Override
    public double volume() {
        return 4 / 3 * Math.PI * Math.pow(x, 3);
    }
}
