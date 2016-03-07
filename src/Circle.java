/**
 * Created by putkanka on 06-Mar-16.
 */
public class Circle extends TwoDimensional {

    public Circle(double rad) {
        super(rad, "Circle");
    }

    public double radius(){
        return x();
    }

    @Override
    public double area() { return Math.PI*Math.pow(radius(),2);

    }
}
