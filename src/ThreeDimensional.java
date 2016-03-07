/**
 * Created by putkanka on 06-Mar-16.
 */
public class ThreeDimensional extends Shape {
    private double x;
    private double y;
    private double z;

    public ThreeDimensional(double x, String type) {
        super(type);
        this.x = x;
    }

    public ThreeDimensional(double x, double y, String type) {
        super(type);
        this.x = x;
        this.y = y;
    }

    public ThreeDimensional(double x, double y, double z, String type) {
        super(type);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double x(){
        return x;
    }

    public double y(){
        return y;
    }

    public double z(){
        return z;
    }

    @Override
    public double area() {
        return x()* y();
    }

    public double volume() {
        return x()* y()* z();
    }

 }
