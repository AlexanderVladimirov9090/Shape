/**
 * Created on 06-Mar-16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Circle extends TwoDimensional {

    public Circle(double rad) {
        super(rad, 0,"Circle");
    }

    @Override
    public double area() { return Math.PI*Math.pow(x,2);

    }
}